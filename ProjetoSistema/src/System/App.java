
package System;
import java.io.Serializable;

public class App implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nome;
    private String descricao;
    private String link;
    private String linkLogo;

    public App(String nome, String descricao, String link, String linkLogo) {
        this.nome = nome;
        this.descricao = descricao;
        this.link = link;
        this.linkLogo = linkLogo;
    }

    public App(String novoNome, String novaDescricao, String novoLink) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getLink() {
        return link;
    }
    
        public String getLinkLogo() {
        return linkLogo;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setLink(String link) {
        this.link = link;
    }
    
    public void setLinkLogo(String linkLogo) {
        this.linkLogo = linkLogo;
    }
}
