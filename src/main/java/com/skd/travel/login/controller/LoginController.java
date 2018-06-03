package com.skd.travel.login.controller;

import com.skd.travel.login.model.User;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1//users")
public class LoginController {
    public HttpEntity<String> ping() {
        return new ResponseEntity<>("I am LoginService", HttpStatus.OK);
    }

    @PostMapping("/signUp")
    public HttpEntity<User> signUp(@RequestBody User user) {
        return new ResponseEntity<>(user, HttpStatus.CREATED);

    }
}
