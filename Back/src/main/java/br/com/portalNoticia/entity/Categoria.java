package br.com.portalNoticia.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

<<<<<<< HEAD
import java.util.List;
import java.util.Set;
=======
import java.util.ArrayList;
import java.util.List;
>>>>>>> 0ad315468dc8f82b2bd34c4a9a84805e7737602f

@Entity
@Data
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String descricao;
    @ManyToOne
    private Categoria categoriaPai;
    @OneToMany(mappedBy = "categoriaPai", fetch = FetchType.LAZY)
    @JsonIgnoreProperties("categoriaPai")
    private List<Categoria> subcategorias;
<<<<<<< HEAD
    @ManyToMany(mappedBy = "categorias")
    private Set<Publicidade> publicidades;
=======
>>>>>>> 0ad315468dc8f82b2bd34c4a9a84805e7737602f

}

