package com.example.security.spring.springSecurityExample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/api/multi-auth")
public class MultiAuthController {
    @GetMapping("/server/test")
    public String serverTestEndPoint(){
        return "This is a secured endpoint! you have succesfully authenticated using api key";
    }

//    @GetMapping("/client/test")
//        public String clientTestEndPoint(Principal principal){
//            return "This is a secured endpoint for clients! your authenticated as " + principal.getName();
//        }

}
