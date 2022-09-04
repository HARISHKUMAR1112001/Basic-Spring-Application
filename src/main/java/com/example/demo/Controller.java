package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/")
    public String home() {
        String str
                = "<html><body><font color=\"red\">"
                + "<h1>Hello World !!</h1>"
                + "</font></body></html>";
        return str;
    }
}
