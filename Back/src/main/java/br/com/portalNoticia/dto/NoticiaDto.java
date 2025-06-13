package br.com.portalNoticia.dto;

import br.com.portalNoticia.entity.Noticia;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

@NoArgsConstructor
@Data
public class NoticiaDto implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String titulo;
    private String conteudo;
    private LocalDate dataPublicacao;
    private Integer categoriaId;
    private String categoriaNome;
    private Integer autorId;
    private String autorNome;
    private boolean destaque;
    private String imagemUrl;

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
}
