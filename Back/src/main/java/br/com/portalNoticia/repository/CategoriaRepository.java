package br.com.portalNoticia.repository;

import br.com.portalNoticia.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {}
