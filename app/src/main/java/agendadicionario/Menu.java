package agendadicionario;

import java.util.Scanner;

import agendadicionario.contatos.ContatoTelefone;
import agendadicionario.contatos.ContatoWhatsApp;

import agendacontatos.contatos.ContatoEmail;
import agendacontatos.contatos.ContatoTelefone;
import agendacontatos.contatos.ContatoWhatsApp;

public class Menu {
    private Agenda agenda; 

    public Menu(Agenda agenda) {
        this.agenda = agenda;
    }

    public void menuAdicionar(int opcaoAdicionar){ // passando parâmentros para funcionar
        Scanner leitor = new Scanner(System.in);

        while (opcaoAdicionar != 0 ) {
            System.out.println("***\nMenu Adicionar \n1 - Adicionar em Telefone\n2 - Adicionar em Email\n3 - Adicionar em WhatsApp\n0 - Voltar\n***");
            
            opcaoAdicionar = leitor.nextInt();

            if (opcaoAdicionar > 0) {
                System.out.print("Nome: ");
                String nomeTelefone = leitor.next();
                System.out.print("Telefone: ");
                int telefone = leitor.nextInt();

                switch (opcaoAdicionar) {
                    case 1:
                        System.out.print("Aniversário: ");
                        int aniversario = leitor.nextInt();
                        ContatoTelefone novoContato = new ContatoTelefone(telefone, nomeTelefone, aniversario);
                        agenda.put(contato, novoContato);
                        break;
                    case 2:
                        System.out.print("Email: ");
                        String email = leitor.next();
                        System.out.println("Deseja adicionar a alguma categoria? 1- sim 2-não");
                        int escolha2 = leitor.nextInt();
                        String relacionamento = null;    

                        if (escolha2 == 1){
                            relacionamento = agenda.categorias();
                            
                        } else {
                            relacionamento = "Nenhum";
                        }

                        agenda.adicionarContato(new ContatoEmail(nomeTelefone, telefone, email, relacionamento));//ver como faz em dicionario
                        break;
                    case 3:
                        agenda.adicionarContato(new ContatoWhatsApp(nomeTelefone, telefone));//ver como faz em dicionario
                        break;
                }
            }
        }
    }

}