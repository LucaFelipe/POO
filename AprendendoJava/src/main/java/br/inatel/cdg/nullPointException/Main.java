package br.inatel.cdg.nullPointException;

import br.inatel.cdg.nullPointException.exercicio1.Clientes;
import br.inatel.cdg.nullPointException.exercicio1.Conta;
import br.inatel.cdg.nullPointException.exercicio1.SaldoInsuficienteException;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta(900, 1000);

        Clientes cliente = new Clientes();
        Clientes cliente2 = new Clientes();
        Clientes cliente3 = null;

        cliente.setNome("Arnaldo");
        cliente.setCpf(123);
        cliente2.setNome("Tiago");
        cliente2.setCpf(121);

        conta.addCliente(cliente);
        conta.addCliente(cliente2);
        conta.addCliente(cliente3);

        conta.mostraInfo();
        try {
            conta.Sacar(4000);
        }catch (SaldoInsuficienteException e){
            System.out.println("saldo insuficiente");
        }

    }
}
