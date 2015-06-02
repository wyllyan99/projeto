
package Principal;

import Cliente.Cliente;
import Filme.Filme;
import Filme.Locadora;
import Filme.classificacao;
import java.io.ObjectInputStream.GetField;
import java.text.SimpleDateFormat;
import java.util.ArrayList; 
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

public class Principal {
    static Locadora locadora = new Locadora();
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int menu = 0;
        int opcao = 0;
        do {
            System.out.println("===== LOCADORA DE FILME =====");
            System.out.println("1 - CADASTRAR CLIENTE");
            System.out.println("2 - PESQUISAR CLIENTE");
//            System.out.println("3 - APAGAR CLIENTE");
            System.out.println("3 - CADASTRAR FILME");
            System.out.println("4 - REALIZAR LOCAÇÃO");
            
            opcao = entrada.nextInt();
            switch (opcao) {
                case 1:
                    cadastrarCliente();
                    break;
                case 2:
                    pesquisaCliente();
                    break;
//                case 3:
//                    excluiCliente();
//                    break;
                case 3:
                    cadastraFilme();
                    break;
                case 4:
                    locaFilme();
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
        System.out.println ("Cadastro realizado com sucesso!\n\n\n");
    }
    public static void pesquisaCliente() {
        Scanner entrada = new Scanner(System.in);
        String cpf;
        boolean resul;

        System.out.println("DIGITE O CPF: ");

        cpf = entrada.nextLine(); 

        for (Cliente cliente : locadora.getListaCliente()) {
            if (cliente.getCpf().equals(cpf)) {
                System.out.println("Cliente: "+ cliente.getNome() + " | " + "CPF: " + cliente.getCpf()+"\n\n");
                return;
            }
            else{
                System.out.println("CLIENTE NAO ENCONTRADO.");
            }
        }
    }
/*    public static void excluiCliente() {
        Scanner entrada = new Scanner(System.in);
        String cpf;
        String decisao = null;
        System.out.println("Lista dos clientes");
        for (Cliente cliente : locadora.getListaCliente()) {   
            System.out.println("Cliente: "+ cliente.getNome() + " | " + "CPF: "+cliente.getCpf());
        }
        
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
            for (Cliente cliente : locadora.getListaCliente()) {
            if (cliente.getCpf().equals(cpf)) {
                
                System.out.println("Cliente excluido : \n Cliente: "+ cliente.getNome() + " | " + "CPF: "+cliente.getCpf());
                locadora.removerCliente(cliente);
            }
        }
            
        }
        else if(decisao.equals("n")) {
            System.out.println("Cliente não apagado");
        }
        else{
            System.out.println("Valor invalido");
        }
        
    }
*/
    public static void cadastraFilme() {
        String titulo;
        int ano;
        double valor;
        int copias;
        Scanner entrada = new Scanner(System.in);
        System.out.println("===== CADASTRAR FILME =====");
        

        System.out.println("TITULO: ");
        titulo = entrada.nextLine();

        System.out.println("ANO: ");
        ano = Integer.parseInt(entrada.nextLine());
    
        System.out.println ("Codigo do Filme");
        int cod = Integer.parseInt(entrada.nextLine());
        
        System.out.println ("Quantidade de copias");
        copias = Integer.parseInt(entrada.nextLine());
        
        classificacao filme = new classificacao(titulo,ano,cod,copias);
        locadora.addFilme(filme);
        
         System.out.println ("Cadastro realizado com sucesso!\n\n");
    }
    public static void locaFilme() {
         Scanner entrada = new Scanner(System.in);
        String nomeFilme;

        Cliente cliente = new Cliente();

        System.out.println("===== LOCAR FILME =====\n");
        for (classificacao filme : locadora.getListaFilme()) {
                System.out.println(".::: LISTA DOS FILMES :::." + 
                "\n TITULO: " + filme.getTitulo() + 
                "\n GENERO: " + filme.getgenero()+ 
                "\n ANO: " + filme.getAno());
          
            }
            System.out.println("DIGITE O NOME DO FILME DESEJADO: ");
            nomeFilme = entrada.nextLine();

            for (classificacao filme : locadora.getListaFilme()) {
                if (filme.getTitulo().equals(nomeFilme)) {
                    
                    System.out.println("qtdd: " +filme.getqtdd());
                    
                    if(filme.getqtdd()>0){
                        System.out.println(".::: A PESQUISA ENCONTROU :::." + 
                        "\n TITULO: " + filme.getTitulo() + 
                        "\n ANO: " + filme.getAno());
                
                        String opcao = null ;
                        System.out.println("DESEJA REALMENTE LOCAR ESTE FILME? ");
                        opcao=entrada.nextLine();
                        switch (opcao) {
                            case "s":
                            case "S":
                                for (Cliente pcliente : locadora.getListaCliente())
                                {
                                    System.out.println(".::: LISTA DOS CLIENTES :::." + 
                                    "\n NOME: " + pcliente.getNome() + 
                                    "\n CPF: " + pcliente.getCpf() + 
                                    "\n ENDERECO: " + pcliente.getEndereco() + 
                                    "\n TELEFONE: " + pcliente.getTelefone());
                                    System.out.println("DIGITE O CPF DO CLIENTE: ");
                                    String cpfCliente = entrada.nextLine();
                                }
                                for (Cliente pcliente : locadora.getListaCliente())
                                {
                                    if (pcliente.getCpf().equals(pcliente.getCpf())) {
                                        System.out.println(".::: A PESQUISA ENCONTROU :::." + 
                                        "\n NOME: " + pcliente.getNome() + 
                                        "\n CPF: " + pcliente.getCpf() + 
                                        "\n ENDERECO: " + pcliente.getEndereco() + 
                                        "\n TELEFONE: " + pcliente.getTelefone());
                        
                                        Calendar calendar = new GregorianCalendar();
                                        SimpleDateFormat out = new SimpleDateFormat(" \"dd/MM/yyyy\" HH:mm:ss  ");
                                        Date date = new Date();
                                        calendar.setTime(date);
         
                                        calendar.add(Calendar.DAY_OF_MONTH, 3);  
                                        System.out.println("Data de devolução: ");
                                        System.out.println(calendar.getTime());
                                        System.out.println("Valor: "+filme.getValor()+"\n\n");
                                        
                                        filme.setqtdd(filme.getqtdd()-1);
                                    }
                                    else{
                                        System.out.println("CLIENTE NAO ENCONTRADO.");
                                    }
                            
                                }
          
                                 break;
                                case "n":
                                    System.out.println("Cliente não excluido");
                                     break;
                                case "N":
                                     System.out.println("Cliente não excluido");
                                     break;
                                 default:
                                     System.out.println("APERTE APENAS S PARA SIM OU N PARA NAO.");
                                     break;
                            }
                        }
                    else{
                     System.out.println("\nNão tem DVD disponivel");
                    }
                }
                        
                    else{
                         System.out.println("\nFILME NAO ENCONTRADO");
                }
            }
 
           
}
}// Criar todas as listas aqui e passar por parametro, outras classes, novas listas. 