package com.example.ec4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class SampleController {

    @GetMapping("/hi")
    public String hi(){
        return "hi";
    }

}
