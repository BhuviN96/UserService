package com.LibraryManagement.UserService.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Data
@AllArgsConstructor
public class BookDTO {
    private String name;
    private String description;
    private String author;
    private String publisher;
    private LocalDate publishedDate;
}
