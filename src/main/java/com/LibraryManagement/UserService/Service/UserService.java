package com.LibraryManagement.UserService.Service;

import com.LibraryManagement.UserService.DTO.UserGetDTO;
import com.LibraryManagement.UserService.Helper.UserServiceHelper;
import com.LibraryManagement.UserService.Repository.UserRepositoy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserService {
    @Autowired
    private UserRepositoy userRepository;
    @Autowired
    private UserServiceHelper userServiceHelper;
    public UserGetDTO getUser(Long id) {
        //log.info("Fetching all users");
        System.out.println("Fetching user with id: " + id);
        System.out.println("User"+ userRepository.findById(id));
        return userServiceHelper.getUserDetails(userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("No User Present with id :" + id)));
    }
}
