package br.inatel.cdg.nullPointException.exercicio1;

import java.util.HashSet;
import java.util.Set;

public class Conta {
    private float saldo;
    private float limite;
    private Set<Clientes> clientes = new HashSet<>();

    public void addCliente(Clientes c){
        clientes.add(c);
    }

    public Conta(float saldo, float limite){
        this.limite = limite;
        this.saldo = saldo;
    }

    public void mostraInfo(){
        for (Clientes cliente: clientes) {

            try {
                System.out.println(cliente.getNome());
                System.out.println(cliente.getCpf());
                System.out.println("Saldo: " + saldo);
                System.out.println("Limite: " + limite);

            } catch (Exception e) {
                System.out.println("usuario invalido");
            }
        }
    }
    public void Sacar(double quantia) throws SaldoInsuficienteException {
        if (quantia <= (saldo + limite)){
            this.saldo -= quantia;
        }else{
            throw new SaldoInsuficienteException();
        }

    }
}