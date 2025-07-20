package com.LibraryManagement.UserService.DTO;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class UserGetDTO {
        private Long userId;
        private String name;
        private String email;
        private String mobileNumber;
        private List<IssuedBooksGetDTO> borrowedBooks;

        public UserGetDTO(Long userId, String name, String email, String mobileNumber) {
                this.userId = userId;
                this.name = name;
                this.email = email;
                this.mobileNumber = mobileNumber;
        }

        public Long getUserId() {
                return userId;
        }

        public void setUserId(Long userId) {
                this.userId = userId;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public String getMobileNumber() {
                return mobileNumber;
        }

        public void setMobileNumber(String mobileNumber) {
                this.mobileNumber = mobileNumber;
        }

        public List<IssuedBooksGetDTO> getBorrowedBooks() {
                return borrowedBooks;
        }

        public void setBorrowedBooks(List<IssuedBooksGetDTO> borrowedBooks) {
                this.borrowedBooks = borrowedBooks;
        }
}