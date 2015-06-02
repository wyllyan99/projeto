
package Principal;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList; 
import java.util.List;
import java.util.Scanner;
import Cliente.Cliente;
import Filme.Filme;
import Filme.Locadora;

public class Principal {
    static Locadora locadora = new Locadora();
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int menu = 0;
        int opcao = 0;
        do {
            System.out.println("===== LOCADORA DE FILME =====");
            System.out.println("1 - CADASTRAR CLIENTE");
            System.out.println("2 - PESQUIZAR CLIENTE");
            System.out.println("3 - APAGAR CLIENTE");
            System.out.println("4 - CADASTRAR FILME");
            System.out.println("5 - REALIZAR LOCAÇÃO");
            opcao = entrada.nextInt();
            switch (opcao) {
                case 1:
                    cadastrarCliente();
                    break;
                case 2:
                    pesquisaCliente();
                    break;
                case 3:
                    excluiCliente();
                    break;
                case 4:
                    cadastraFilme();
                    break;
                case 5:
                    locaFilme();
                    default:
                    System.out.println("Op222ao invalida.");
                    break;
            }            
        } while (menu == 0);}

    public static void cadastrarCliente() {
        Scanner entrada = new Scanner(System.in);
        Cliente cliente = new Cliente();

        System.out.println("===== CADASTRAR CLIENTE =====");

        System.out.println("NOME: ");
        cliente.setNome(entrada.nextLine());

        System.out.println("CPF: ");
        cliente.setCpf(entrada.nextLine());

        System.out.println("ENDERECO: ");
        cliente.setEndereco(entrada.nextLine());

        System.out.println("TELEFONE: ");
        cliente.setTelefone(entrada.nextLine());

        locadora.addCliente(cliente);

    }
    public static void pesquisaCliente() {
        Scanner entrada = new Scanner(System.in);
        String cpf;
        boolean resul;

        System.out.println("DIGITE O CPF: ");

        cpf = entrada.nextLine(); 

        for (Cliente cliente : locadora.getListaCliente()) {
            if (cliente.getCpf().equals(cpf)) {
                System.out.println("Cliente: "+ cliente.getNome() + " | " + "CPF: " + cliente.getCpf());
                return;
            }
            else{
                System.out.println("CLIENTE NAO ENCONTRADO.");
            }
        }
        //System.out.println("CLIENTE NAO ENCONTRADO.");
    }
    public static void excluiCliente() {
        Scanner entrada = new Scanner(System.in);
        String cpf;
        String decisao = null;

        System.out.println("DIGITE O CPF: ");
        cpf = entrada.nextLine();

        for (Cliente cliente : locadora.getListaCliente()) {
            if (cliente.getCpf().equals(cpf)) {
                System.out.println("Cliente: "+ cliente.getNome() + " | " + "CPF: "+cliente.getCpf());
            }
        }

        System.out.println("DESEJA REALMENTE APAGAR ESTE CLIENTE? ");
        decisao = entrada.nextLine();

        if (decisao.equals("s")) {
            locadora.removerCliente(cpf);
        }
        else if(decisao.equals("n")) {
            System.out.println("Cliente não apagado");
        }
        else{
            System.out.println("Valor invalido");
        }
        
    }

    public static void cadastraFilme() {
        String titulo;
//        String genero;
        int ano;
        double valor;
        int cod;
        Scanner entrada = new Scanner(System.in);
        System.out.println("===== CADASTRAR FILME =====");

        System.out.println("TITULO: ");
        //filme.setTitulo(entrada.nextLine());
        titulo = entrada.nextLine();
//        System.out.println("GENERO: ");
        //filme.setGenero(entrada.nextLine());
 //       genero = entrada.nextLine();
        System.out.println("ANO: ");
 //       filme.setAno(Integer.parseInt(entrada.nextLine()));
        ano = Integer.parseInt(entrada.nextLine());
 //       System.out.println("VALOR DA LOCACAO: ");
 //       filme.setValorLocacao(Double.parseDouble(entrada.nextLine()));
        
        System.out.println ("Codigo do Filme");
        cod = Integer.parseInt(entrada.nextLine());//filme.setCodigo(Integer.parseInt(entrada.nextLine()));
         Filme filme = new Filme(titulo,ano,cod);
        locadora.addFilme(filme);
    }
public static void locaFilme() {
        Scanner entrada = new Scanner(System.in);
        String nomeFilme;

        Cliente cliente = new Cliente();

        System.out.println("===== LOCAR FILME =====\n");
        System.out.println("DIGITE O NOME DO FILME DESEJADO: ");
        nomeFilme = entrada.nextLine();

        for (Filme filme : locadora.getListaFilme()) {
            if (filme.getTitulo().equals(nomeFilme)) {
                System.out.println(".::: A PESQUISA ENCONTROU :::." + 
            "\n TITULO: " + filme.getTitulo() + 
            "\n ANO: " + filme.getAno());
     //       "\n GENERO: " + filme.getGenero() + 
     //       "\n VALOR: " + filme.getValorLocacao());

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
  
                for (Cliente pcliente : locadora.getListaCliente())
                {
                    
                    if (pcliente.getCpf().equals(pcliente.getCpf())) {
                        System.out.println(".::: A PESQUISA ENCONTROU :::." + 
                    "\n NOME: " + pcliente.getNome() + 
                    "\n CPF: " + pcliente.getCpf() + 
                    "\n ENDERECO: " + pcliente.getEndereco() + 
                    "\n TELEFONE: " + pcliente.getTelefone());
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
            */
                break;

            case "n":
            case "N":


            default:
                System.out.println("APERTE APENAS S PARA SIM OU N PARA NAO.");
                break;
            }

        }
    }
}// Criar todas as listas aqui e passar por parametro, outras classes, novas listas. 