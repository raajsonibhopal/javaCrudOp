package com.raj.basicCrud.Controller;

import com.raj.basicCrud.Model.User;
import com.raj.basicCrud.Service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MainController {
    @Autowired
    IUserService iUserService;

    @GetMapping("/getAllUsers")
    List<User> getUsers(){
        return iUserService.getAllUsers();
    }

    @PostMapping("/saveUser")
    User saveUser(@RequestBody User user){
        return iUserService.saveUser(user);
    }

    @PutMapping("/updateUser")
    User updateUser(@RequestBody User user){
        return iUserService.UpdateUser(user);
    }

    @DeleteMapping("/deleteUser/{id}")
    void deleteUser(@PathVariable Long id){
        iUserService.DeleteUser(id);
    }
}
