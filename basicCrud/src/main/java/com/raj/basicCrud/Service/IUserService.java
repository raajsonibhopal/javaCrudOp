package com.raj.basicCrud.Service;

import com.raj.basicCrud.Model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IUserService {
    List<User> getAllUsers();

    User saveUser(User user);

    User UpdateUser(User updateUser);

    void DeleteUser(Long id);
}
