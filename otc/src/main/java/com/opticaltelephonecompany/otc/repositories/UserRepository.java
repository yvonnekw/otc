package com.opticaltelephonecompany.otc.repositories;

import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.opticaltelephonecompany.otc.entities.User;

/**
 * Mostly used in {@link com.opticaltelephonecompany.otc.service.UserService}.<br><br>
 *
 * @see com.opticaltelephonecompany.otc.service.UserService
 */

@SuppressWarnings("SameReturnValue")
@Transactional(readOnly = true)
@Repository
public interface UserRepository extends JpaRepository<User, UUID> {

    Optional<User> findByLogin(String login);

    // Exists by
    boolean existsByLoginOrEmail(String login, String email);
    boolean existsByLogin(String login);
    boolean existsByEmail(String email);

    // Delete
    @Modifying
    int deleteByLogin(String login);


    
}
