package agendadicionario;

import java.util.HashMap;
import java.util.Scanner;

import agendadicionario.contatos.Contato;



public class Agenda {
    HashMap<Contato, String> agenda;

    public Agenda(){
        agenda = new HashMap<Contato, String>();
    }

    public void adicionarContato(Contato contato, String nome){
        agenda.put(contato, nome);
    }

    public void listarContatos() {
        for (Contato contato : agenda.keySet()) {
            String nome = agenda.get(contato);
            System.out.println("Nome: " + nome);
            System.out.println("Contato: " + contato.getContato());
            System.out.println("Chamada de Vídeo: " + contato.isChamadaVideo() + "\n");
        }
    }

    public void removerContato(){
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o número do contato que deseja remover: ");
        int numeroContato = leitor.nextInt();
        for (Contato contato : agenda.keySet()){
            if (contato.getContato() == numeroContato){
                agenda.remove(contato);
                System.out.println("Contato removido!");
            } else {
                System.out.println("Contato não existe na agenda!");
            }

        }
    }

    //public void editarContato(){
        //Scanner leitor = new Scanner(System.in);
        //System.out.print("Digite o número do contato que deseja editar: ");
        //int numeroContato = leitor.nextInt();
        //for (Contato contato : agenda.keySet()){
            
        //}
    //}
    

}