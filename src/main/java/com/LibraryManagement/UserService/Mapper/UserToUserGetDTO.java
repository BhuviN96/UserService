package com.LibraryManagement.UserService.Mapper;

import com.LibraryManagement.UserService.DTO.IssuedBooksGetDTO;
import com.LibraryManagement.UserService.DTO.UserGetDTO;
import com.LibraryManagement.UserService.Model.UserData;

import java.util.List;

public class UserToUserGetDTO {
    public static UserGetDTO mapToUserGetDTO(UserData user , List<IssuedBooksGetDTO> issuedBooks) {
        if (user == null) {
            return null;
        }
        return new UserGetDTO(user.getUserId(), user.getName(), user.getEmail(), user.getMobileNumber(), issuedBooks);
    }
}
