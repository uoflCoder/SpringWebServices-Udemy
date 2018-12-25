package com.tylorcornett.webservices.repositories;

import com.tylorcornett.webservices.models.UserDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaRepository extends JpaRepository<UserDto, Long>
{
}
