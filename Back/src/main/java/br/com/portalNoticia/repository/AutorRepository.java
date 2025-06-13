package br.com.portalNoticia.repository;

import br.com.portalNoticia.entity.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

<<<<<<< HEAD
import java.util.List;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Integer> {
    List<Autor> findByNomeContainingIgnoreCase(String nome);
=======
@Repository
public interface AutorRepository extends JpaRepository<Autor, Integer> {
>>>>>>> 0ad315468dc8f82b2bd34c4a9a84805e7737602f
}
