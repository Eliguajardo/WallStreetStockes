package com.example.wallstreetstocks.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

public class LoginController {

        @GetMapping("/login")
        public String showLoginForm() {
            return "users/login";
        }


    }

}
