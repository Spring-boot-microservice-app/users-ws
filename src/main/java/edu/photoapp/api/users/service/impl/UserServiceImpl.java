package edu.photoapp.api.users.service.impl;

import edu.photoapp.api.users.dto.UserDto;
import edu.photoapp.api.users.entity.User;
import edu.photoapp.api.users.repository.UserRepository;
import edu.photoapp.api.users.service.UserService;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;
    @Override
    public UserDto createUser(UserDto userDetails) {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        userDetails.setUserId(UUID.randomUUID().toString());
        userDetails.setEncryptedPassword("test");
        User user = modelMapper.map(userDetails, User.class);
        userRepository.save(user);
        return userDetails;
    }
}
