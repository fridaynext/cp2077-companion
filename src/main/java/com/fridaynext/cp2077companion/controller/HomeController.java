package com.fridaynext.cp2077companion.controller;

import com.fridaynext.cp2077companion.repository.AchievementRepository;
import com.fridaynext.cp2077companion.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private final UserRepository userRepo;
    private final AchievementRepository achievementRepo;
    // TODO: might need to add a GameRepo - but not now

    // Constructor
    public HomeController(UserRepository userRepo, AchievementRepository achievementRepo) {
        this.userRepo = userRepo;
        this.achievementRepo = achievementRepo;
    }

    @GetMapping("/") // might need to remove the / with recent version of maven dependency
    public String showHome(Model model) {
        // This will be the home page - will possibly need to grab user achievements if they are currently logged in
        return "home.html";
    }
}
