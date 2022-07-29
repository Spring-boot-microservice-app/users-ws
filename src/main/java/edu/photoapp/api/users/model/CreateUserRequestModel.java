package edu.photoapp.api.users.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
public class CreateUserRequestModel {
    @NotNull(message = "first name cannot be null")
    @Size(min = 2, message = "first name must not be less than 2 characters")
    private String firstName;

    @NotNull(message = "last name cannot be null")
    @Size(min = 2, message = "last name must not be less than 2 characters")
    private String lastName;

    @NotNull(message = "email name cannot be null")
    @Email
    private String email;

    @NotNull(message = "password cannot be null")
    @Size(min = 8, max = 16, message = "password should be between 8 and 16 characters")
    private String password;
}
