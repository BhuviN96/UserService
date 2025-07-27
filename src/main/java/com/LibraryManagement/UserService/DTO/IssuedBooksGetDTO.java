package com.LibraryManagement.UserService.DTO;



import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
@Data
@AllArgsConstructor
public class IssuedBooksGetDTO {
    private BookDTO book;
    private LocalDate issueDate;
    private LocalDate returnDate;
    private boolean isReturned;

}
