
package System;
import java.io.Serializable;

public class App implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nome;
    private String descricao;
    private String link;

    public App(String nome, String descricao, String link) {
        this.nome = nome;
        this.descricao = descricao;
        this.link = link;
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
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
