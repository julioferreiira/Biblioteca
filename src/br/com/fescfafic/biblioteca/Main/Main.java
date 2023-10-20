package br.com.fescfafic.biblioteca.Main;

import br.com.fescfafic.biblioteca.Model.Livros;
import br.com.fescfafic.biblioteca.Model.*;

public class Main {
    public static void main(String[] args) {
        Funcionario bibliotecario = new Funcionario("João");
        Guarda seguranca = new Guarda("Carlos");
        Cliente cliente = new Cliente("Maria");
        Livros livro = new Livros("Aventuras de Sherlock Holmes");
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");


        biblioteca.abrir();


        bibliotecario.atenderCliente(cliente);


        seguranca.verificarEmprestimo(livro);


        livro.emprestar();


        livro.devolver();


        biblioteca.fechar();
    }
}
