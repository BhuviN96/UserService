package com.LibraryManagement.UserService.Helper;

import com.LibraryManagement.UserService.Client.BookClient;
import com.LibraryManagement.UserService.DTO.BookDTO;
import com.LibraryManagement.UserService.DTO.UserGetDTO;
import com.LibraryManagement.UserService.Mapper.UserToUserGetDTO;
import com.LibraryManagement.UserService.Model.UserData;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class UserServiceHelper {
    @Autowired
    private BookClient bookClient;
    @Autowired
    private ModelMapper modelMapper;

    public UserGetDTO getUserDetails(UserData user){
            Long borrowedBookIds = user.getBorrowedBookId();
            System.out.println("Borrowed Book Ids: " + borrowedBookIds);
            UserGetDTO userGetDTO = UserToUserGetDTO.mapToUserGetDTO(user);
            userGetDTO.setBorrowedBooks(bookClient.getBookById(borrowedBookIds));
            System.out.println("UserGetDTO: " + userGetDTO);
        return userGetDTO;
    }
}
