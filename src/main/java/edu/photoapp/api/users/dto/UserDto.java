package edu.photoapp.api.users.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
public class UserDto implements Serializable {

    @Serial
    private static final long serialVersionUID = 4851913625077692909L;

    private String userId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String encryptedPassword;
}
