package br.com.fescfafic.biblioteca.Model;

public class Funcionario {
    public String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public void atenderCliente(Cliente cliente) {
        System.out.println(nome + " está atendendo o(a) cliente " + cliente.nome);
    }
}
