package edu.photoapp.api.users.service;

import edu.photoapp.api.users.dto.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    UserDto createUser(UserDto user);
    UserDto getUserDetailsByEmail(String email);

}
