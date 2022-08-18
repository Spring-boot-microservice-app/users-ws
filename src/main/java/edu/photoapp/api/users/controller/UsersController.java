package edu.photoapp.api.users.controller;

import edu.photoapp.api.users.dto.UserDto;
import edu.photoapp.api.users.model.SignupRequest;
import edu.photoapp.api.users.service.UserService;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<UserDto> createUser(@Valid @RequestBody SignupRequest user){
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        UserDto userDetails = modelMapper.map(user, UserDto.class);
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.createUser(userDetails));
    }
}
