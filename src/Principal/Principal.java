
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
        //    Cliente cliente = new Cliente();
        //    Filme filme = new Filme();

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
                        filme.cadastraFilme();
                        break;
                        
                    case 5:
                        filme.locaFilme();

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
        //    locadora.removerCliente(cpf);
        }
        else {
            return;
        }


        return;
    }

       public static void cadastraFilme() {
        Filme filme = new Filme();
        Scanner entrada = new Scanner(System.in);
        System.out.println("===== CADASTRAR FILME =====");

        System.out.println("TITULO: ");
        filme.setTitulo(entrada.nextLine());

        System.out.println("GENERO: ");
        filme.setGenero(entrada.nextLine());

        System.out.println("ANO: ");
        filme.setAno(Integer.parseInt(entrada.nextLine()));

        System.out.println("VALOR DA LOCACAO: ");
        filme.setValorLocacao(Double.parseDouble(entrada.nextLine()));
        
        System.out.println ("Codigo do Filme");
        filme.setcodigo(Integer.parseInt(entrada.nextLine()));

        locadora.addFilme(filme);
    }

}// Criar todas as listas aqui e passar por parametro, outras classes, novas listas. 