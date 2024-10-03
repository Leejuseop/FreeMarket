package juseop.freemarket.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class FreeMarketController {

    @GetMapping("/login")
    public String loginForm(){
        return "login";
    }
    
    @GetMapping("/signUp")
    public String signUpForm(){
        return "signUp.html";
    }
}
