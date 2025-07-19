package com.LibraryManagement.UserService.Mapper;

import com.LibraryManagement.UserService.DTO.UserGetDTO;
import com.LibraryManagement.UserService.Model.UserData;

public class UserToUserGetDTO {
    public static UserGetDTO mapToUserGetDTO(UserData user) {
        if (user == null) {
            return null;
        }
        UserGetDTO userGetDTO = new UserGetDTO(user.getUserId(), user.getName(), user.getEmail(), user.getMobileNumber());
        return userGetDTO;
    }
}
