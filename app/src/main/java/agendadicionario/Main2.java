package agendadicionario;

import java.util.ArrayList;
import java.util.List;

import agendadicionario.contatos.Contato;

public class Main2 {
  public static void main(String[] args) {
    ArrayList<Contato> contatos = new ArrayList<>();
    Contato c1 = new Contato(1, "Antonio", false);
    Contato c2 = new Contato(2, "Eduarda", true);
    Contato c3 = new Contato(3, "Clara", false);
    contatos.add(c1);
    contatos.add(c2);
    contatos.add(c3);

    List<Contato> contatos1 = contatos.stream().filter(c -> (c.contato % 2 != 0)).toList();
    List<Contato> contatos2 = contatos.stream().filter(c -> c.chamadaVideo).toList();
    

  }
}