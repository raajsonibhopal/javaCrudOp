package com.raj.basicCrud.Service;

import com.raj.basicCrud.Model.User;
import com.raj.basicCrud.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CUserService implements IUserService {
    @Autowired
    UserRepo userRepo;

    @Override
    public List<User> getAllUsers() {
        List<User> userList = userRepo.findAll();
        return userList;
    }

    @Override
    public User saveUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public User UpdateUser(User updateUser) {
        return userRepo.save(updateUser);
    }

    @Override
    public void DeleteUser(Long id) {
         userRepo.deleteById(id);
    }
}
