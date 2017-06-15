package com.suren.springsecurity.securitydbexample.repository;

import com.suren.springsecurity.securitydbexample.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Created by Surendirababu on 6/13/2017.
 */
public interface UsersRespository extends JpaRepository<User,Integer> {

    Optional<User> findByUserName(String userName);
}
