package br.com.fescfafic.biblioteca.Model;

public class Guarda {
    public String nome;

    public Guarda(String nome) {
        this.nome = nome;
    }

    public void verificarEmprestimo(IServicos objeto) {
        System.out.println(nome + " está verificando o empréstimo de um objeto.");
    }
}
