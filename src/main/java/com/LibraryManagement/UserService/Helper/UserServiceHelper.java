package com.LibraryManagement.UserService.Helper;

import com.LibraryManagement.UserService.Client.IssuedBookClient;
import com.LibraryManagement.UserService.DTO.IssuedBooksGetDTO;
import com.LibraryManagement.UserService.DTO.UserGetDTO;
import com.LibraryManagement.UserService.Mapper.UserToUserGetDTO;
import com.LibraryManagement.UserService.Model.UserData;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserServiceHelper {
    @Autowired
    private IssuedBookClient issuedBookClient;
    @Autowired
    private ModelMapper modelMapper;

    public UserGetDTO getUserDetails(UserData user){
            Long borrowedBookIds = user.getBorrowedBookId();
            System.out.println("Borrowed Book Ids: " + borrowedBookIds);
            List<IssuedBooksGetDTO> issuedBooks= issuedBookClient.getIssuedBookById(user.getUserId());
            UserGetDTO userGetDTO = UserToUserGetDTO.mapToUserGetDTO(user,issuedBooks);
            System.out.println("UserGetDTO: " + userGetDTO);
        return userGetDTO;
    }
}
