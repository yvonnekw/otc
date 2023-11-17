package com.opticaltelephonecompany.otc.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.opticaltelephonecompany.otc.dto.SignUpUserDto;
import com.opticaltelephonecompany.otc.exception.AtLeastOneFieldIncorrectException;
import com.opticaltelephonecompany.otc.exception.EmailIsTakenException;
import com.opticaltelephonecompany.otc.exception.LoginIsTakenException;
import com.opticaltelephonecompany.otc.exception.NoSuchUserException;
import com.opticaltelephonecompany.otc.entities.User;
import com.opticaltelephonecompany.otc.repositories.UserRepository;
import com.opticaltelephonecompany.otc.validation.SignUpUserDtoValidator;
import com.opticaltelephonecompany.otc.validation.SignUpUserDtoValidationResult;

/**
 * Performs main logic of operations like registering, authentication and deletion of an account.<br><br>
 *
 * @see UserRepository
 * @see com.opticaltelephonecompany.otc.controller.user.UserController
 */

@Service
public class UserService {
      private final UserRepository userRepository;
      private final PasswordEncoder passwordEncoder;
 
    @Autowired
    UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public boolean deleteUserByLogin(String login) {
        return userRepository.deleteByLogin(login) == 1;
    }

    public List<User> getUsers(){
        return userRepository.findAll();
    }
  
    public User getUserByLogin(String login) {
        return userRepository.findByLogin(login).orElseThrow(NoSuchUserException::new);
    }

    public User getUserByUUID(UUID uuid) {
        return userRepository.findById(uuid).orElseThrow(NoSuchUserException::new);
    }

    public void addSignUpUserDto(SignUpUserDto dto) {
        // Throws HTTP422 if not valid
        checkIfValid(dto);
        // Throws HTTP409 if a field is taken
        checkIfTaken(dto);

        // Add
        User user = User.valueOf(dto, passwordEncoder);
        addUser(user);
    }

    // Throws HTTP422 (with a reason) if not valid
    private void checkIfValid(SignUpUserDto dto) {
        SignUpUserDtoValidationResult validationResult = SignUpUserDtoValidator.validate(dto);
        if(!validationResult.isSuccess()) {
            throw new AtLeastOneFieldIncorrectException();
        }
    }

    // Throws HTTP409 (with a field taken) if taken
    private void checkIfTaken(SignUpUserDto dto) {
        if(userRepository.existsByLoginOrEmail(dto.login(), dto.email())) {
            if(userRepository.existsByLogin(dto.login())) {
                throw new LoginIsTakenException();
            }
            else {
                throw new EmailIsTakenException();
            }
        }
    }
    
    private void addUser(User user) {
        userRepository.save(user);
    }
    
    
}
