package edu.photoapp.api.users.service;

import edu.photoapp.api.users.dto.UserDto;

public interface UserService {
    UserDto createUser(UserDto user);
}
