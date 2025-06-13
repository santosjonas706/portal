package br.com.portalNoticia.dto;

import br.com.portalNoticia.entity.Noticia;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
<<<<<<< HEAD
import java.time.LocalDate;
=======
import java.security.Timestamp;
>>>>>>> 0ad315468dc8f82b2bd34c4a9a84805e7737602f

@NoArgsConstructor
@Data
public class NoticiaDto implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String titulo;
    private String conteudo;
<<<<<<< HEAD
    private LocalDate dataPublicacao;
=======
    private Timestamp dataPublicacao;
>>>>>>> 0ad315468dc8f82b2bd34c4a9a84805e7737602f
    private Integer categoriaId;
    private String categoriaNome;
    private Integer autorId;
    private String autorNome;
<<<<<<< HEAD
    private boolean destaque;
    private String imagemUrl;
=======
>>>>>>> 0ad315468dc8f82b2bd34c4a9a84805e7737602f

    public NoticiaDto(Noticia noticia) {
        this.id = noticia.getId();
        this.titulo = noticia.getTitulo();
        this.conteudo = noticia.getConteudo();
        this.dataPublicacao = noticia.getDataPublicacao();

        if(noticia.getCategoria() != null) {
            this.categoriaId = noticia.getCategoria().getId();
            this.categoriaNome = noticia.getCategoria().getDescricao();
        }
        if(noticia.getAutor() != null) {
            this.autorId = noticia.getAutor().getId();
            this.autorNome = noticia.getAutor().getNome();
        }
<<<<<<< HEAD
        this.imagemUrl = noticia.getImagemUrl();
    }

    public boolean getDestaque() {
        return destaque;
    }

    public void setDestaque(boolean destaque) {
        this.destaque = destaque;
    }

    public String getImagemUrl() {
        return imagemUrl;
    }
    public void setImagemUrl(String imagemUrl) {
        this.imagemUrl = imagemUrl;
    }
=======
    }


>>>>>>> 0ad315468dc8f82b2bd34c4a9a84805e7737602f
}
