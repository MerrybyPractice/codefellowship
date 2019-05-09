package com.codefellowship.controllers;

import com.codefellowship.database.CodefellowshipUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class CodefellowshipController {

    @Autowired
    CodefellowshipUserRepository userRepo;

    //base route with splash page and basic info

    //single account info page


}
