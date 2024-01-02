package com.techiecookie.app.controller;

import com.techiecookie.app.dto.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/hello")
    public String home() {
        return "Hello World !!";
    }

    @GetMapping("/user")
    public User getUser() {
        return User.builder()
                .firstName("Techie")
                .lastName("Cookie")
                .email("techiecookie@gmail.com")
                .build();
    }

    @GetMapping("/path/{value1}/{value2}")
    public String pathDemo(@PathVariable("value1") String userInput1,
                           @PathVariable("value2") String userInput2) {
        return "Input 1 / Input 2 " + userInput1 + "/" + userInput2;
    }

    @GetMapping("/userDetails")
    public User requestParamsDemo(@RequestParam("firstName") String firstName,
                                  @RequestParam("lastName") String lastName,
                                  @RequestParam("email") String email,
                                  @RequestParam(value = "phoneNo", required = false, defaultValue = "N/A") String phoneNo) {

        return User.builder()
                .firstName(firstName)
                .lastName(lastName)
                .email(email)
                .phoneNo(phoneNo)
                .build();
    }
}
