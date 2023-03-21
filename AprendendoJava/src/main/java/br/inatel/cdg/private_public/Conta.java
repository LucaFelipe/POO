package br.inatel.cdg.private_public;
public class Conta {
    private static int qtdClientes;
    private double saldo;

    Cliente cliente;

    public Conta(){
        qtdClientes++;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public static void mQtd(){
        System.out.println("Quantidade de clientes: " + Conta.qtdClientes);
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void sacar(double valor){
        if(this.saldo > valor){
            this.saldo -= valor;
        }
        else{
            System.out.println("Saldo insuficiente");
        }
    }
    public void extrato(){
        System.out.println("Seu saldo eh: " + this.saldo);
    }
}
