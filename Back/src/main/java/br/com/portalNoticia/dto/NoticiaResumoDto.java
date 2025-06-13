package br.com.portalNoticia.dto;

import br.com.portalNoticia.entity.Noticia;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
<<<<<<< HEAD
import java.sql.Timestamp;
=======
import java.security.Timestamp;
>>>>>>> 0ad315468dc8f82b2bd34c4a9a84805e7737602f

@Data
public class NoticiaResumoDto implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String titulo;
    private Timestamp dataPublicacao;

    public NoticiaResumoDto(Noticia noticia) {
        this.id = noticia.getId();
        this.titulo = noticia.getTitulo();
<<<<<<< HEAD
        this.dataPublicacao = Timestamp.valueOf(noticia.getDataPublicacao().atStartOfDay());
=======
        this.dataPublicacao = noticia.getDataPublicacao();
>>>>>>> 0ad315468dc8f82b2bd34c4a9a84805e7737602f
    }
}
