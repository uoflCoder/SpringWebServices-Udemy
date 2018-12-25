package com.tylorcornett.webservices.services;

import com.tylorcornett.webservices.models.UserPost;
import com.tylorcornett.webservices.models.UserDto;
import com.tylorcornett.webservices.repositories.UserJpaRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService
{
    private UserJpaRepository userJpaRepository;


    @Autowired
    public UserServiceImpl(UserJpaRepository userJpaRepository)
    {
        this.userJpaRepository = userJpaRepository;
    }


    @Override
    public List<UserPost> getUsers()
    {
        return null;
    }

    @Override
    public UserPost getUserById(Long id)
    {
        return null;
    }

    @Override
    public UserDto createUser(UserPost userPost)
    {
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(userPost, userDto);
        return userJpaRepository.save(userDto);

    }

    @Override
    public UserPost updateUser(UserPost userPost)
    {
        return null;
    }

    @Override
    public void deleteUser(UserPost userPost)
    {

    }


}
