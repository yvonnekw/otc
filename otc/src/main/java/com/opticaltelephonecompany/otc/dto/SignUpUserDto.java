package com.opticaltelephonecompany.otc.dto;

/**
 * Used to exchange data with an api consumer while signing up.<br><br>
 *
 * @see com.opticaltelephonecompany.otc.model.User

 */

public final record SignUpUserDto(String login, String fullName, String email, String password1, String password2) {}
    

