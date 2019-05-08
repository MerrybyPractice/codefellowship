package com.codefellowship.controllers;

import com.codefellowship.database.CodefellowshipUser;
import com.codefellowship.database.CodefellowshipUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class AccountController {

    @Autowired
    CodefellowshipUserRepository repo;

    @Autowired
    PasswordEncoder encoder;

    @GetMapping("/signup")
    public String getSignup() {
        return "signup";
    }

    @PostMapping("/signup")
    public String postSignup(
            @RequestParam String username,
            @RequestParam String password,
            @RequestParam String favoriteProgrammingLanguage,
            @RequestParam String startedProgramming,
            @RequestParam String firstName,
            @RequestParam String lastName,
            @RequestParam String pronouns,
            @RequestParam String dateOfBirth,
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
        user.setPronouns(pronouns);
        user.setDateOfBirth(dateOfBirth);
        user.setBio(bio);
        user.setOs(os);

        repo.save(user);

//        Authentication authentication = new UsernamePasswordAuthenticationToken(user, null, new ArrayList<>());
//        SecurityContextHolder.getContext().setAuthentication(authentication);

        return "/signup";
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

    //single account info page
    @GetMapping("/{id}")
    public String viewSingleUser(@PathVariable Long id,
                                 Model model) throws Exception {
        Optional<CodefellowshipUser> foundUser = repo.findById(id);

        if (foundUser.isPresent()) {
            model.addAttribute("user", foundUser.get());
            return "userdetails";
        }

        throw new Exception();
    }

//    @GetMapping("/myprofile")
//    public String viewMyAccount()
}
