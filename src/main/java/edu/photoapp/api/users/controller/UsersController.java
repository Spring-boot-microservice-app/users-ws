package edu.photoapp.api.users.controller;

import edu.photoapp.api.users.dto.UserDto;
import edu.photoapp.api.users.model.CreateUserRequestModel;
import edu.photoapp.api.users.service.UserService;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private Environment env;

    @Autowired
    private UserService userService;

    @GetMapping()
    public String index(){
        return "Hello, World!";
    }

    @GetMapping("/status/check")
    public String status(){
        return "Working on port " + env.getProperty("local.server.port");
    }

    @PostMapping
    public String createUser(@Valid @RequestBody CreateUserRequestModel user){
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        UserDto userDetails = modelMapper.map(user, UserDto.class);
        userService.createUser(userDetails);
        return "user successfully created";
    }
}
