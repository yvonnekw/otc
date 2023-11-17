package com.opticaltelephonecompany.otc.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

/**
 * Thrown if a user tries to authenticate, but their username doesn't exist.<br>
 *
 * @see org.springframework.web.server.ResponseStatusException
 * @see com.opticaltelephonecompany.otccontroller.user.AuthenticationController
 * @see com.opticaltelephonecompany.otc.service.AuthenticationService
 */

public class NoSuchUsernameAuthenticationException extends ResponseStatusException {
      public NoSuchUsernameAuthenticationException() {
        super(HttpStatus.UNAUTHORIZED, "NO_SUCH_USERNAME_AUTHENTICATION_EXCEPTION");
    }
    
}
