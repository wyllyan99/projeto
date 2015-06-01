package Conta;

import java.util.Date;
import Filme.Filme;

public class Locacao {

    // Atributos (Variaveis)
    private Date data;
    private double valorTotalAPagar;
    private Filme listaFilmes;

    // Construtor
    public Locacao(Date data, double valorTotalAPagar, Filme listaFilmes) {
        this.data = data;
        this.valorTotalAPagar = valorTotalAPagar;
        this.listaFilmes = listaFilmes;
    }

    // Acoes ou Metodos (Funcoes)s
    public void Locacao() {
       // Locacao locacao = new Locacao ();
        System.out.println ("Digite o codigo do filme");
        
           
            
    }

    public void Locacao(Date data) {

    }

    public void addFilme(Filme filme) {
        listaFilmes = filme;
    }

    // Getters e Setters
    public Date getData() {
        return this.data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValorTotalAPagar() {
        return this.valorTotalAPagar;
    }

    public void setValorTotalAPagar(double valorTotalAPagar) {
        this.valorTotalAPagar = valorTotalAPagar;
    }
}
