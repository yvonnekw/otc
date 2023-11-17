package com.opticaltelephonecompany.otc.security;

import org.springframework.security.core.GrantedAuthority;
import com.opticaltelephonecompany.otc.entities.Role;

/**
 * Simple {@link GrantedAuthority} implementation.
 * It is based on {@link com.opticaltelephonecompany.otc.model.User}'s {@link Role}s.<br><br>
 *
 * @see com.opticaltelephonecompany.otc.model.User
 * @see Role
 */

@SuppressWarnings("ClassCanBeRecord")
public class GrantedAuthorityImpl implements GrantedAuthority {
    private final Role role;

    public GrantedAuthorityImpl(Role role) {
        this.role = role;
    }

    @Override
    public String getAuthority() {
        return this.role.grantedAuthorityString;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(!(o instanceof GrantedAuthorityImpl that)) return false;

        return role == that.role;
    }

    @Override
    public int hashCode() {
        return role.hashCode();
    }
    
}
