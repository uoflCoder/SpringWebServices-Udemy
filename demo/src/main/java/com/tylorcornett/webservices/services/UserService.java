package com.tylorcornett.webservices.services;

import com.tylorcornett.webservices.models.UserPost;
import com.tylorcornett.webservices.models.UserDto;


import java.util.List;

public interface UserService
{
    List<UserPost> getUsers();
    UserPost getUserById(Long id);
    UserDto createUser(UserPost userPost);
    UserPost updateUser(UserPost userPost);
    void deleteUser(UserPost userPost);

}
