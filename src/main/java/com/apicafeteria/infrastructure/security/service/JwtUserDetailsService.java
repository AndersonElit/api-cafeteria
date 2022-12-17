package com.apicafeteria.infrastructure.security.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if ("apicafeteria".equals(username)) {
            return new User("apicafeteria", "$2a$10$8mUeIcQ4PBG0ZkHd1nFAlO4p2qoKSCVKu1moIsvjsR6lYwS92MViC",
                    new ArrayList<>());
        } else {
            throw new UsernameNotFoundException("Usuario no encontrado con el nombre: " + username);
        }
    }
}
