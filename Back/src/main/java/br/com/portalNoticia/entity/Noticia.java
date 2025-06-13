package br.com.portalNoticia.entity;

import jakarta.persistence.*;
import lombok.Data;

<<<<<<< HEAD
import java.time.LocalDate;
=======
import java.security.Timestamp;
>>>>>>> 0ad315468dc8f82b2bd34c4a9a84805e7737602f

@Entity
@Data
public class Noticia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String titulo;
    private String conteudo;
<<<<<<< HEAD
    private LocalDate dataPublicacao;
=======
    private Timestamp dataPublicacao;
>>>>>>> 0ad315468dc8f82b2bd34c4a9a84805e7737602f
    @ManyToOne
    private Categoria categoria;
    @ManyToOne
    private Autor autor;
<<<<<<< HEAD
    @Column(nullable = false)
    private boolean destaque;
    private String imagemUrl; // Caminho/URL da imagem

    public Noticia(Integer id, String titulo, String conteudo, LocalDate dataPublicacao, Categoria categoria, Autor autor, boolean destaque) {
=======

    public Noticia(Integer id, String titulo, String conteudo, Timestamp dataPublicacao, Categoria categoria, Autor autor) {
>>>>>>> 0ad315468dc8f82b2bd34c4a9a84805e7737602f
        this.id = id;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.dataPublicacao = dataPublicacao;
        this.categoria = categoria;
        this.autor = autor;
<<<<<<< HEAD
        this.destaque = destaque;
    }

    public Noticia() {
        // Construtor padrão necessário para JPA e uso em serviços
    }

    public boolean getDestaque() {
        return destaque;
    }

    public void setDestaque(boolean destaque) {
        this.destaque = destaque;
    }

    public boolean isDestaque() {
        return destaque;
    }

    public String getImagemUrl() {
        return imagemUrl;
    }

    public void setImagemUrl(String imagemUrl) {
        this.imagemUrl = imagemUrl;
=======
>>>>>>> 0ad315468dc8f82b2bd34c4a9a84805e7737602f
    }
}
