package com.opticaltelephonecompany.otc.validation;

import com.opticaltelephonecompany.otc.dto.SignUpUserDto;

/**
 * Enum contains result of validation of {@link SignUpUserDto}.<br><br>
 *
 * @see SignUpUserDto
 * @see SignUpUserDtoValidator
 * @see Validator
 */

public enum SignUpUserDtoValidationResult implements ValidationResult {
    LOGIN_NOT_CORRECT,
    FULL_NAME_NOT_CORRECT,
    EMAIL_NOT_CORRECT,
    PASSWORD_NOT_CORRECT,
    PASSWORDS_DIFFERENT,
    AT_LEAST_ONE_FIELD_IS_NULL,
    SUCCESS;

    @Override
    public boolean isSuccess() {
        return this == SUCCESS;
    }
    
}
