package com.opticaltelephonecompany.otc.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

/**
 * Thrown if a user tries to authenticate, but their password does not match their username.<br>
 *
 * @see org.springframework.web.server.ResponseStatusException
 * @see com.opticaltelephonecompany.otc.controller.user.AuthenticationController
 * @see com.opticaltelephonecompany.otc.service.AuthenticationService
 */

public class PasswordDoesNotMatchException extends ResponseStatusException {
     public PasswordDoesNotMatchException() {
        super(HttpStatus.UNAUTHORIZED, "PASSWORD_DOES_NOT_MATCH_EXCEPTION");
    }
    
}
