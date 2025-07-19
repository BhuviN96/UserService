package com.LibraryManagement.UserService.Client;

import com.LibraryManagement.UserService.DTO.BookDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "book-service", url = "http://localhost:8080") // or use Eureka service name
public interface BookClient {
    @GetMapping("book/{id}")
    BookDTO getBookById(@PathVariable("id") Long id);
}
