package br.com.fescfafic.biblioteca.Model;

public class Biblioteca implements IHorarioDeFuncionamento {
    public String nome;

    public Biblioteca(String nome) {
        this.nome = nome;
    }

    @Override
    public void abrir() {
        System.out.println(nome + " está aberta. Bem-vindo à biblioteca!");
    }

    @Override
    public void fechar() {
        System.out.println(nome + " está fechada. Até a próxima visita!");
    }
}
