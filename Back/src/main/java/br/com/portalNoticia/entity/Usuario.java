package br.com.portalNoticia.entity;

import jakarta.persistence.Entity;
import lombok.Data;
<<<<<<< HEAD
import lombok.EqualsAndHashCode;
@Entity
@Data
@EqualsAndHashCode(callSuper = true)
=======
import lombok.NoArgsConstructor;

@Entity
@Data
>>>>>>> 0ad315468dc8f82b2bd34c4a9a84805e7737602f
public class Usuario extends Pessoa {

    private String login;
    private String senha;

<<<<<<< HEAD
=======

>>>>>>> 0ad315468dc8f82b2bd34c4a9a84805e7737602f
}
