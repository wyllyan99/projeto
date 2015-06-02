/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Filme;

import Cliente.Cliente;
import java.util.ArrayList;

public class Locadora {
    private  ArrayList<Cliente> listaCliente = new ArrayList<Cliente>(); 
    private  ArrayList<classificacao> listaFilme = new ArrayList<classificacao>();

    public void addCliente (Cliente tCliente){
        
        this.listaCliente.add(tCliente);
    }
    public void addFilme (classificacao tFilme){
            this.listaFilme.add(tFilme);
    }
    
   public ArrayList<Cliente> getListaCliente(){
       
       return listaCliente;
   }
   
   public ArrayList<classificacao> getListaFilme(){
       
       return listaFilme;
   }
   
   public void removerCliente(Cliente rCliente){
       this.listaCliente.remove(rCliente);
   }
   
}
