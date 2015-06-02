package Filme;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import Cliente.Cliente;

public class Filme {

    Scanner entrada = new Scanner(System.in);

//    List<Filme> listaFilme = new ArrayList<Filme>();

    private String titulo;
    private int ano;
//    private String genero;
//    private double valorLocacao;
    private int codigo;

    public Filme( String titulo, int ano, int codigo) {

        this.titulo = titulo;
        this.ano = ano;
  //      this.genero = genero;
  //      this.valorLocacao = valorLocacao;
        this.codigo= codigo;
    }
// Deixar toda a parte de baixo em outra classe, deixar nessa classe apenas o que é construtor. 

    


    //Acoes ou Metodos (Funcoes)
 /*   public void cadastraFilme() {
        //Filme filme = new Filme();
        System.out.println("===== CADASTRAR FILME =====");

        System.out.println("TITULO: ");
        this.setTitulo(entrada.nextLine());

        System.out.println("GENERO: ");
        this.setGenero(entrada.nextLine());

        System.out.println("ANO: ");
        this.ano = Integer.parseInt(entrada.nextLine());

        System.out.println("VALOR DA LOCACAO: ");
        this.valorLocacao = Double.parseDouble(entrada.nextLine());
        
        System.out.println ("Codigo do Filme");
        this.codigo= Integer.parseInt(entrada.nextLine());

        listaFilme.add(filme);
    }
*/
/*    public void locaFilme() {

        String nomeFilme;

        Cliente cliente = new Cliente();

        System.out.println("===== LOCAR FILME =====\n");
        System.out.println("DIGITE O NOME DO FILME DESEJADO: ");
        nomeFilme = entrada.nextLine();

        for (Filme filme : listaFilme) {
            if (filme.getTitulo().equals(nomeFilme)) {
                System.out.println(".::: A PESQUISA ENCONTROU :::." + 
            "\n TITULO: " + getTitulo() + 
            "\n ANO: " + getAno() + 
            "\n GENERO: " + getGenero() + 
            "\n VALOR: " + getValorLocacao());

            }
        }
        //System.out.println("FILME NAO ENCONTRADO.");

        if (!("FILME NAO ENCONTRADO".equals(nomeFilme))) {
            String opcao = null ;
            System.out.println("DESEJA REALMENTE LOCAR ESTE FILME? ");
            opcao=entrada.nextLine();

            

            switch (opcao) {
            case "s":
            case "S":
                System.out.println("DIGITE O CPF DO CLIENTE: ");
                String cpfCliente = entrada.nextLine();

                //for(Cliente pcliente : cliente.listaCliente) 
  
                for (Cliente pcliente : cliente.listaCliente)
                {
                    
                    if (cliente.getCpf().equals(cliente.getCpf())) {
                        System.out.println(".::: A PESQUISA ENCONTROU :::." + 
                    "\n NOME: " + cliente.getNome() + 
                    "\n CPF: " + cliente.getCpf() + 
                    "\n ENDERECO: " + cliente.getEndereco() + 
                    "\n TELEFONE: " + cliente.getTelefone());
                        return;
                        
                    }
                    else{
                System.out.println("CLIENTE NAO ENCONTRADO.");
            }
                //    if (!("CLIENTE NAO ENCONTRADO.".equals(cpfCliente))) {


                  //  }
                }
              /*  System.out.println("CLIENTE NAO ENCONTRADO.");

                if (!("CLIENTE NAO ENCONTRADO.".equals(cpfCliente))) {


                }
            
                break;

            case "n":
            case "N":


            default:
                System.out.println("APERTE APENAS S PARA SIM OU N PARA NAO.");
                break;
            }

        }
    }*/


    // Getters e Setters    


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

/*    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(double valorLocacao) {
        this.valorLocacao = valorLocacao;
    }
     public void setCodigo(int codigo) {
        this.codigo = codigo;
    }*/
}