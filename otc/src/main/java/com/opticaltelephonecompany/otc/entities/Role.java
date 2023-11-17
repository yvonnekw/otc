package com.opticaltelephonecompany.otc.entities;

/**
 * Enum that indicates if a {@link User} has admin privileges.<br><br>
 *
 * @see User
 */

public enum Role {
    USER("ROLE_USER"),
    ADMIN("ROLE_ADMIN");

    public final String grantedAuthorityString;

    Role(String grantedAuthorityString) {
        this.grantedAuthorityString = grantedAuthorityString;
    }
    
}
