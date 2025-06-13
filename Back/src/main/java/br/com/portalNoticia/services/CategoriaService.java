package br.com.portalNoticia.services;

import br.com.portalNoticia.dto.CategoriaDto;
import br.com.portalNoticia.entity.Categoria;
import br.com.portalNoticia.repository.CategoriaRepository;
import org.apache.coyote.BadRequestException;
<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
=======
>>>>>>> 0ad315468dc8f82b2bd34c4a9a84805e7737602f
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

<<<<<<< HEAD
    @Autowired
=======
>>>>>>> 0ad315468dc8f82b2bd34c4a9a84805e7737602f
    private CategoriaRepository repository;

    public List<Categoria> findAll() {
        return repository.findAll();
    }

<<<<<<< HEAD
    public Categoria findById(Long id) throws BadRequestException {
        Optional<Categoria> categoria = repository.findById(id);
        if (categoria.isEmpty()) {
=======
    public Categoria findById(Integer id) throws BadRequestException {
        Optional<Categoria> categoria = repository.findById(id);
        if(categoria.isEmpty()) {
>>>>>>> 0ad315468dc8f82b2bd34c4a9a84805e7737602f
            throw new BadRequestException("Categoria não encontrada");
        }
        return categoria.get();
    }

    public Categoria insert(Categoria categoria) {
        return repository.save(categoria);
    }

<<<<<<< HEAD
    public void delete(Long id) throws BadRequestException {
        findById(id);
=======
    public void delete(Integer id) {
        repository.findById(id);
>>>>>>> 0ad315468dc8f82b2bd34c4a9a84805e7737602f
        repository.deleteById(id);
    }

    public Categoria update(Categoria obj) throws BadRequestException {
<<<<<<< HEAD
        Categoria categoria = findById(obj.getId().longValue());
        categoriaUpdate(categoria, obj);
        return repository.save(categoria);
    }

    private void categoriaUpdate(Categoria atual, Categoria novo) {
=======
        Categoria categoria = findById(obj.getId());
        CategoriaUpdate(categoria, obj);
        return repository.save(categoria);
    }

    private void CategoriaUpdate(Categoria novo, Categoria atual) {
>>>>>>> 0ad315468dc8f82b2bd34c4a9a84805e7737602f
        atual.setCategoriaPai(novo.getCategoriaPai());
        atual.setDescricao(novo.getDescricao());
        atual.setSubcategorias(novo.getSubcategorias());
    }

    public Categoria fromDto(CategoriaDto dto) {
        Categoria categoria = new Categoria();
        categoria.setId(dto.getId());
        categoria.setDescricao(dto.getDescricao());
        if (dto.getCategoriaPaiId() != null) {
            Categoria pai = new Categoria();
            pai.setId(dto.getCategoriaPaiId());
            categoria.setCategoriaPai(pai);
        }

        if (dto.getSubcategoriasIds() != null) {
            List<Categoria> subcategorias = dto.getSubcategoriasIds().stream().map(id -> {
                Categoria sub = new Categoria();
                sub.setId(id);
                return sub;
            }).toList();
<<<<<<< HEAD
            categoria.setSubcategorias(subcategorias);
=======
>>>>>>> 0ad315468dc8f82b2bd34c4a9a84805e7737602f
        }
        return categoria;
    }
}
