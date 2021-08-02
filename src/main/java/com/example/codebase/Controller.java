package com.example.codebase;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/{name}")
    public String getwish(@PathVariable String name)
    {
        return "Hey "+name +" !!";

    }
    @PostMapping("/{name}")
    public String postwish(@PathVariable String name)
    {
        return "Hey "+name +"details saved and they are shit shit shit lot of shit!and i making way more shit!";

    }
}
