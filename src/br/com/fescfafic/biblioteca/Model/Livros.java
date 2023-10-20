package br.com.fescfafic.biblioteca.Model;

public class Livros implements IServicos {
    public String titulo;
    public boolean emprestado;

    public Livros(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void emprestar() {
        if (!emprestado) {
            emprestado = true;
            System.out.println("Livro emprestado: " + titulo);
        } else {
            System.out.println("Livro já emprestado: " + titulo);
        }
    }

    @Override
    public void devolver() {
        if (emprestado) {
            emprestado = false;
            System.out.println("Livro devolvido: " + titulo);
        } else {
            System.out.println("O livro já está na biblioteca: " + titulo);
        }
    }
}
