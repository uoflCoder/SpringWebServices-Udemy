package com.tylorcornett.webservices.controllers;

import com.tylorcornett.webservices.models.UserPost;
import com.tylorcornett.webservices.models.UserDto;
import com.tylorcornett.webservices.models.UserGet;
import com.tylorcornett.webservices.services.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping({"users", "/users"})
public class UserController
{
    private UserService userService;

    @Autowired
    public UserController(UserService userService)
    {
        this.userService = userService;
    }

    @GetMapping
    public List<UserPost> getUsers()
    {
        return userService.getUsers();
    }

    @GetMapping(value = "/{id}")
    public UserPost getUserById(@PathVariable Long id)
    {
        return userService.getUserById(id);
    }

    @PostMapping
    public UserGet createUser(@RequestBody UserPost userPost)
    {
        UserGet userGet = new UserGet();
        UserDto userDto = new UserDto();

        BeanUtils.copyProperties(userPost, userDto);
        userDto = userService.createUser(userPost);

        BeanUtils.copyProperties(userDto, userGet);

        return userGet;
    }

    @PutMapping
    public UserPost updateUser(UserPost userPost)
    {
        return userService.updateUser(userPost);
    }

    @DeleteMapping
    public void deleteUser(UserDto user)
    {

    }




}
