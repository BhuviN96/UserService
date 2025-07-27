package com.LibraryManagement.UserService.DTO;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@AllArgsConstructor
@Data
public class UserGetDTO {
        private Long userId;
        private String name;
        private String email;
        private String mobileNumber;
        private List<IssuedBooksGetDTO> borrowedBooks;
}