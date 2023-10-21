package com.chatgp.Util.Controller;

import com.chatgp.Util.UtilClass;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/v1")
public class MainController {


    @GetMapping("/invoke")
    public String mainController() {

        return "<h1>THis is the main controller</h1>";
    }
}
