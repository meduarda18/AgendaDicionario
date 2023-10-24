package agendadicionario.contatos;

public class Contato{
    public int contato;
    public String nome;
    public boolean chamadaVideo = false;

    public Contato(Integer contato, String nome, boolean chamadaVideo){
        this.contato = contato;        
        this.nome = nome;
        this.chamadaVideo = chamadaVideo;

    }

    public Integer getContato() {
        return contato;
    }

    public void setContato(Integer contato) {
        this.contato = contato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isChamadaVideo() {
        return false;
    }

    public void setChamadaVideo(boolean chamadaVideo) {
        this.chamadaVideo = chamadaVideo;
    }

}