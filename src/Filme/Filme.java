package Filme;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import Cliente.Cliente;

public class Filme {

    Scanner entrada = new Scanner(System.in);

    private String titulo;
    private int ano;
    private int codigo;

    public Filme( String titulo, int ano, int codigo) {

        this.titulo = titulo;
        this.ano = ano;
        this.codigo= codigo;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}