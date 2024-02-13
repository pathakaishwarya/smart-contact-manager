package com.smart.smart.contact.manager.controller;

import com.smart.smart.contact.manager.entities.Contact;
import com.smart.smart.contact.manager.entities.User;
import com.smart.smart.contact.manager.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home(Model model){
        model.addAttribute("title","Home - smart Contact Manager");
        return "home";
    }
}
