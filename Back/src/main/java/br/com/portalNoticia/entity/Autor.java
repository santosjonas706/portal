package br.com.portalNoticia.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;
<<<<<<< HEAD
import lombok.EqualsAndHashCode;

import java.util.List;
@Entity
@Data
@EqualsAndHashCode(callSuper = true)
=======

import java.util.List;

@Entity
@Data
>>>>>>> 0ad315468dc8f82b2bd34c4a9a84805e7737602f
public class Autor extends Pessoa {

    private String biografia;
    @OneToMany(mappedBy = "autor")
    @JsonIgnore
    private List<Noticia> noticias;
}
