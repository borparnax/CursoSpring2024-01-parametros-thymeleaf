package com.nacho.curso.springboot.webapp.springbootweb.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.nacho.curso.springboot.webapp.springbootweb.models.User;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) {

        User user = new User("Nacho", "Bootez");
        user.setEmail("nbootez@fakemail.com");
        model.addAttribute("title", "Hola Worldo Spring Boot");
        model.addAttribute("user", user);
        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model) {
        model.addAttribute("title", "Listado de usuarios:");
        return "list";
    }
    
    @ModelAttribute("users")
    public List<User> usersModel() {
        return Arrays.asList(
                new User("Frank", "Vandyke"),
                new User("Mario", "Brosez", "mbrosez@fakemail.com"),
                new User("Maria", "Catela", "juana@fakemail.com"),
                new User("Vicente", "Bou"));
    }

}
