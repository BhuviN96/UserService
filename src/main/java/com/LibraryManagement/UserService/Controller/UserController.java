package com.LibraryManagement.UserService.Controller;

import com.LibraryManagement.UserService.DTO.UserGetDTO;
import com.LibraryManagement.UserService.Service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/users/{id}")
    public ResponseEntity<Object> getUser(@PathVariable Long id){
        UserGetDTO users  = userService.getUser(id);
            return ResponseEntity.ok().body(users);
        }
}
