package br.com.portalNoticia.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

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

}

