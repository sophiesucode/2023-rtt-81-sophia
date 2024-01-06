package com.glab30951.ExerciseOne_Rest.TestController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller//purpose:
@RequestMapping("home")//purpose:
public class MyController {

    @RequestMapping("/login")
    public String showlogin(){
        return "inboxpage";
    }

    @RequestMapping("/")
    public String simplemethod(){
        //mapped to hostname:port/home
        return "inboxpage";
    }

    @RequestMapping("/index")
    public String showindex(){
        //mapped to hostname:port/home/index/
        return "inboxpage";
    }

}
