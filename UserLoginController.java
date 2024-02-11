package com.mydata.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.mydata.model.User;
import com.mydata.service.UserService;

@Controller
public class UserLoginController {
    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String showLoginForm(Model model) {
        model.addAttribute("user", new User());
        return "login.html";
    }

    @PostMapping("/login")
    public String loginUser(@ModelAttribute("user") User user, Model model) {
    	if (userService.isValidUser(user)) {
    	    return "redirect:/home"; 
    	} else {
    	    model.addAttribute("error", "Invalid username or password");
    	    return "login.html";
    	}
    }
}
