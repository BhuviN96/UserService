package com.LibraryManagement.UserService.Repository;

import com.LibraryManagement.UserService.Model.UserData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositoy extends JpaRepository<UserData, Long> {}
