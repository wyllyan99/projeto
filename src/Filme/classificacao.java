/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Filme;

/**
 *
 * @author Mariana
 */
public class classificacao extends Filme{
    
    private double valor;
    private int cod;
    private String genero;
    private int qtdd_copias;

    public classificacao(String titulo, int ano, int codigo,int qtdd) {
        super(titulo, ano, codigo);
        this.qtdd_copias=qtdd;
        if(codigo==0){
            this.valor = 4.00;
            this.cod = 0;
            this.genero="Normal";
        }else if(codigo==1){
            this.valor = 5.00;
            this.cod = 1;
            this.genero="Lançamento";
        }else{
            this.valor = 3.50;
            this.cod = 2;
            this.genero="infantil";
        
     }
    }
    public double getValor() {
        return valor;
    }
    public int getCod() {
        return cod;
    }
     public String getgenero() {
        return genero;
    }
    public void setValor(double valor1) {
        this.valor = valor1;
    }
    public void setCod(int cod1) {
        this.cod = cod1;
    }
    public void setGenero(String genero1) {
        this.genero = genero1;
    }
     public int getqtdd() {
        return qtdd_copias;
    }
     public void setqtdd(int cop) {
        this.qtdd_copias=cop;
    }
}
