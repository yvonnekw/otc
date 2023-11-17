package com.opticaltelephonecompany.otc.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

/**
 * Thrown if someone calls the API with an incorrect field.<br>
 * For example if someone tries to sign up with a login that doesn't
 * pass validation specified in {@link com.opticaltelephonecompany.otc.validation.SignUpUserDtoValidator}.<br><br>
 *
 * @see org.springframework.web.server.ResponseStatusException
 */

public class AtLeastOneFieldIncorrectException extends ResponseStatusException{
     public AtLeastOneFieldIncorrectException() {
        super(HttpStatus.UNPROCESSABLE_ENTITY, "AT_LEAST_ONE_FIELD_INCORRECT_EXCEPTION");
    }
    
}
