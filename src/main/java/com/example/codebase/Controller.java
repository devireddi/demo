package com.example.codebase;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/{name}")
    public String getwish(@PathVariable String name)
    {
        return "Hey "+name;

    }
}
