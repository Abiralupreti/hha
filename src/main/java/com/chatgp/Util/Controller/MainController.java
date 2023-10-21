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
    public void mainController(){
        int n = 8; // Number of threads
        for(int i = 0; i < n; i++) {
            UtilClass object = new UtilClass();
            object.start();
        }
    }
    }

