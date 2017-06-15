package com.suren.springsecurity.securitydbexample.resource;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Surendirababu on 6/13/2017.
 */
@RequestMapping("/rest/hello")
@EnableGlobalMethodSecurity(prePostEnabled = true)
@RestController
public class HelloResource {

    @GetMapping("/all")
    public String hello()
    {
        return "hello";
    }

    @GetMapping("/secured/details/all")
    @PreAuthorize("hasRole('ADMIN')")
    public String helloSecurity()
    {
        return "helloSecurityDetails";
    }
}
