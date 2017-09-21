package io.drewbot.firstspringdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String index(@RequestParam("message") String message,
                        @RequestParam("firstName") String firstName,
                        @RequestParam("lastName") String lastName,
                        Model model) {
        model.addAttribute("message", message);
        model.addAttribute("name", firstName + " " + lastName);

        return "index";
    }
}
