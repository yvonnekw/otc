package com.opticaltelephonecompany.otc.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

/**
 * Thrown if a user tries to refresh their JWT access token, but there is no such refresh token.<br>
 *
 * @see org.springframework.web.server.ResponseStatusException
 * @see com.opticaltelephonecompany.otc.controller.user.AuthenticationController
 * @see com.opticaltelephonecompany.otc.service.AuthenticationService
 */

public class NoSuchRefreshTokenException extends ResponseStatusException{

      public NoSuchRefreshTokenException() {
        super(HttpStatus.UNAUTHORIZED, "NO_SUCH_REFRESH_TOKEN_EXCEPTION");
    }
    
}
