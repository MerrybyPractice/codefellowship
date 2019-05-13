package com.codefellowship.controllers;

import com.codefellowship.database.CodefellowshipUserRepository;
import com.codefellowship.database.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class CodefellowshipController {

    @Autowired
    PostRepository repo;

    @Autowired
    CodefellowshipUserRepository userRepo;


    //base route with splash page and basic info
    @GetMapping("")
    public String splashPage(Model model) {
        return "splashpage";
    }

    @PostMapping("createpost/")
    public String newPost(Model model) {
        return "newpost";
    }

    //TODO Finish this shit

//    @GetMapping("/feed")
//
//    public String getFeed(Model model,
//                          Principal principal) {
//
//
//        return "feed";
//    }

}
