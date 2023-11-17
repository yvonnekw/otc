package com.opticaltelephonecompany.otc.validation;

/**
 * Implementations of a {@link Validator}, return a value from a corresponding implementation of
 * {@link ValidationResult} enum.<br><br>
 *
 * @see Validator
 */

public interface ValidationResult {
    boolean isSuccess();
    
}
