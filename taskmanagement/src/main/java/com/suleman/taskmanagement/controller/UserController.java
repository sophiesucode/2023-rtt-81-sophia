package com.suleman.taskmanagement.controller;

import com.suleman.taskmanagement.model.User;
import com.suleman.taskmanagement.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/index")
    public String home() {
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        User user = new User();
        model.addAttribute("Users", user);
        return "userregistration";
    }

    @PostMapping("/register/save")
    public String registration(@Valid @ModelAttribute("Users") User user, BindingResult result,
                               Model model)




    {
        User existingUser = userService.findByEmail(user.getEmail()); // Checking for Existing Collector

        if (existingUser != null && existingUser.getEmail() != null && !existingUser.getEmail().isEmpty()) {
            result.rejectValue("email", null, "There is already an account registered with the same email");
        }



        if (result.hasErrors()) {   // Handling Validation Error
            model.addAttribute("Users", user);



            return "userregistration";
        }
        userService.saveUser(user);
        return "redirect:/register?success";
    }
}
