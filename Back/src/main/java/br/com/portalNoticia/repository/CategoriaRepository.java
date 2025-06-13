package br.com.portalNoticia.repository;

import br.com.portalNoticia.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {}
=======
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}
>>>>>>> 0ad315468dc8f82b2bd34c4a9a84805e7737602f
