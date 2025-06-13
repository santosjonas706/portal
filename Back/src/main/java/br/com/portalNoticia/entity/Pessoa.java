package br.com.portalNoticia.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;
<<<<<<< HEAD
=======
import lombok.Getter;
>>>>>>> 0ad315468dc8f82b2bd34c4a9a84805e7737602f

@Entity
@Data
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String email;

    public Pessoa(){

    }
    @Builder
    public Pessoa(Integer id,String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

}
