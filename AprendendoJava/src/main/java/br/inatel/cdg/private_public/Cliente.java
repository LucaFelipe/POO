package br.inatel.cdg.private_public;

public class Cliente {
    private String nome;
    private long cpf;

    public void getNome(String nome) {
        this.nome = nome;
    }

    public void getCpf(long cpf) {
        this.cpf = cpf;
    }
}
