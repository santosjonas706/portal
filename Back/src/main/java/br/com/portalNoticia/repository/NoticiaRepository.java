package br.com.portalNoticia.repository;

import br.com.portalNoticia.entity.Noticia;
import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface NoticiaRepository extends JpaRepository<Noticia, Long> {
    // Query derivada
    List<Noticia> findByDestaqueTrue();
    List<Noticia> findByDestaque(Boolean destaque);
    List<Noticia> findByDestaqueFalse();

    // JPQL
    @Query("SELECT n FROM Noticia n WHERE n.destaque = true")
    List<Noticia> buscarNoticiasEmDestaque();

    // SQL nativo (opcional)
    @Query(value = "SELECT * FROM noticia WHERE destaque = true", nativeQuery = true)
    List<Noticia> buscarNoticiasEmDestaqueSQL();

    // Retorna uma única notícia em destaque
    Optional<Noticia> findOneByDestaqueTrue();
=======
import org.springframework.stereotype.Repository;

@Repository
public interface NoticiaRepository extends JpaRepository<Noticia, Integer> {
>>>>>>> 0ad315468dc8f82b2bd34c4a9a84805e7737602f
}
