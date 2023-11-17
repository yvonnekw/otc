package com.opticaltelephonecompany.otc.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

/* 
 * Thrown if someone wants to sign up with an email that is taken.<br><br>
 * @see org.springframework.web.server.ResponseStatusException
 */

public class EmailIsTakenException extends ResponseStatusException {
     public EmailIsTakenException() {
        super(HttpStatus.CONFLICT, "EMAIL_IS_TAKEN_EXCEPTION");
    }
    
}
