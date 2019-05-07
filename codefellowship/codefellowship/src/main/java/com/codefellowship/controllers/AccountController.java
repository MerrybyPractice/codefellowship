package com.codefellowship.controllers;

import com.codefellowship.database.CodefellowshipUser;
import com.codefellowship.database.CodefellowshipUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class AccountController {

    @Autowired
    CodefellowshipUserRepository repo;

    @Autowired
    PasswordEncoder encoder;

    @GetMapping("/signup")
    public String getSighup() {
        return "signup";
    }

    @PostMapping("/signup")
    public String postSignup(
            @RequestParam String username,
            @RequestParam String password,
            @RequestParam String favoriteProgrammingLanguage,
            @RequestParam Date startedProgramming,
            @RequestParam String firstName,
            @RequestParam String lastName,
            @RequestParam Date dateOfBirth,
            @RequestParam String bio,
            @RequestParam String os
    ) {

        CodefellowshipUser user = new CodefellowshipUser();
        user.setUsername(username);
        user.setPassword(encoder.encode(password));
        user.setFavoriteProgrammingLanguage(favoriteProgrammingLanguage);
        user.setStartedProgramming(startedProgramming);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setDateOfBirth(dateOfBirth);
        user.setBio(bio);
        user.setOs(os);

        repo.save(user);

        return "/login";

    }

    @GetMapping("/login")
    public String getLogin() {
        return "login";
    }

    @GetMapping("/login-error")
    @ResponseBody
    public String getLoginError() {
        return "Username or Password not found.";
    }
}
