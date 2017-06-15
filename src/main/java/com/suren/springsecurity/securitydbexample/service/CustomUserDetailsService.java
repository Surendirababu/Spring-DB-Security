package com.suren.springsecurity.securitydbexample.service;

import com.suren.springsecurity.securitydbexample.model.CustomUserDetails;
import com.suren.springsecurity.securitydbexample.model.User;
import com.suren.springsecurity.securitydbexample.repository.UsersRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by Surendirababu on 6/13/2017.
 */
@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    UsersRespository usersRespository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
    {
        Optional<User> optionalUsers=usersRespository.findByUserName(username);
        optionalUsers.orElseThrow(()-> new UsernameNotFoundException("usename not found"));
        return optionalUsers.map(user -> new CustomUserDetails(user)).get();
    }
}
