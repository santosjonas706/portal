package br.com.portalNoticia.services;

import br.com.portalNoticia.dto.NoticiaDto;
import br.com.portalNoticia.entity.Autor;
import br.com.portalNoticia.entity.Categoria;
import br.com.portalNoticia.entity.Noticia;
import br.com.portalNoticia.repository.NoticiaRepository;
import org.apache.coyote.BadRequestException;
<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
=======
>>>>>>> 0ad315468dc8f82b2bd34c4a9a84805e7737602f
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NoticiaService {

<<<<<<< HEAD
    @Autowired
    private NoticiaRepository repository;

    @Autowired
    private CategoriaService categoriaService;

    @Autowired
    private AutorService autorService;

=======
    private NoticiaRepository repository;

>>>>>>> 0ad315468dc8f82b2bd34c4a9a84805e7737602f
    public List<Noticia> findAll() {
        return repository.findAll();
    }

<<<<<<< HEAD
    public Noticia findById(Long id) throws BadRequestException {
=======
    public Noticia findById(Integer id) throws BadRequestException {
>>>>>>> 0ad315468dc8f82b2bd34c4a9a84805e7737602f
        Optional<Noticia> noticia = repository.findById(id);
        if(noticia.isEmpty()) {
            throw new BadRequestException("Noticia não encontrada");
        }
        return noticia.get();
    }

    public Noticia insert(Noticia noticia) {
        return repository.save(noticia);
    }

<<<<<<< HEAD
    public void delete(Long id) throws BadRequestException {
=======
    public void delete(Integer id) throws BadRequestException {
>>>>>>> 0ad315468dc8f82b2bd34c4a9a84805e7737602f
        findById(id);
        repository.deleteById(id);
    }

    public Noticia update (Noticia obj) throws BadRequestException{
<<<<<<< HEAD
        Noticia noticia = findById(obj.getId().longValue());
=======
        Noticia noticia = findById(obj.getId());
>>>>>>> 0ad315468dc8f82b2bd34c4a9a84805e7737602f
        noticiaUpdate(noticia, obj);
        return repository.save(noticia);
    }

    private void noticiaUpdate(Noticia antigo, Noticia novo) {
        antigo.setAutor(novo.getAutor());
        antigo.setCategoria(novo.getCategoria());
<<<<<<< HEAD
        antigo.setTitulo(novo.getTitulo());
        antigo.setConteudo(novo.getConteudo());
        antigo.setDataPublicacao(novo.getDataPublicacao());
        antigo.setDestaque(novo.getDestaque());
        antigo.setImagemUrl(novo.getImagemUrl());
    }

    public Noticia fromDto(NoticiaDto dto) {
        Noticia noticia = new Noticia();
        noticia.setId(dto.getId());
        noticia.setTitulo(dto.getTitulo());
        noticia.setConteudo(dto.getConteudo());
        noticia.setDataPublicacao(dto.getDataPublicacao());
        noticia.setDestaque(dto.getDestaque());
        noticia.setImagemUrl(dto.getImagemUrl());
        Categoria categoria = null;
        if (dto.getCategoriaId() != null) {
            try {
                categoria = categoriaService.findById(dto.getCategoriaId().longValue());
            } catch (Exception e) {
                throw new RuntimeException("Categoria não encontrada para o ID: " + dto.getCategoriaId());
            }
        }
        noticia.setCategoria(categoria);
        Autor autor = null;
        if (dto.getAutorId() != null) {
            try {
                autor = autorService.findById(dto.getAutorId());
            } catch (Exception e) {
                throw new RuntimeException("Autor não encontrado para o ID: " + dto.getAutorId());
            }
        }
        noticia.setAutor(autor);
        return noticia;
    }
}
=======
        antigo.setConteudo(novo.getConteudo());
        antigo.setTitulo(novo.getTitulo());
        antigo.setDataPublicacao(novo.getDataPublicacao());
    }

    public Noticia fromDto(NoticiaDto dto) {
        Categoria categoria = new Categoria();
        categoria.setId(dto.getCategoriaId());

        Autor autor = new Autor();
        autor.setId(dto.getAutorId());
        return new Noticia(
                dto.getId(),
                dto.getTitulo(),
                dto.getConteudo(),
                dto.getDataPublicacao(),
                categoria,
                autor
        );
    }
}
>>>>>>> 0ad315468dc8f82b2bd34c4a9a84805e7737602f
