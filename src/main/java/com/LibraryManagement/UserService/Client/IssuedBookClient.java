package com.LibraryManagement.UserService.Client;

import com.LibraryManagement.UserService.DTO.IssuedBooksGetDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "issued-book", url = "http://localhost:8082") // or use Eureka service name
public interface IssuedBookClient {
    @GetMapping("/getIssuedBookById/{userId}")
    List<IssuedBooksGetDTO> getIssuedBookById(@PathVariable Long userId);
}