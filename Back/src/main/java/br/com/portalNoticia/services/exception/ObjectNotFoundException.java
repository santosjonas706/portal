package br.com.portalNoticia.services.exception;

import java.io.Serial;
<<<<<<< HEAD


public class ObjectNotFoundException extends RuntimeException {
=======
import java.io.Serializable;


public class ObjectNotFoundException extends RuntimeException implements Serializable {
>>>>>>> 0ad315468dc8f82b2bd34c4a9a84805e7737602f
    @Serial
    private static final long serialVersionUID = 1L;

    public ObjectNotFoundException(String msg) {
        super(msg);
    }
}
