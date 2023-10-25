package agendadicionario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner leitor = new Scanner(System.in);

      System.out.print("1- Iniciar o app Agenda de Contatos \n2- Não iniciar o app Agenda de Contatos \nDigite o número da opção escolhida: ");
      
      int opcao = leitor.nextInt();

      if (opcao == 1) {
        Agenda agenda = new Agenda();
        Menu menu = new Menu(agenda);

        while(true){
          System.out.println("\n*** Menu ***\n1 - Adicionar contato\n2 - Remover contato\n3 - Atualizar conato\n4 - Listar contatos\n0 - Sair\n");

          opcao = leitor.nextInt(); 
          if (opcao == 0){
            break;
          } else if (opcao == 1){
            menu.menuAdicionar(opcao); // recebeu argumento // tem que fazer o menu adiconar
          } else if (opcao == 4){
            agenda.listarContatos();
          } else if (opcao == 2){
            agenda.removerContato();
          }                 
        }
      }
        leitor.close();
    }
}
      



