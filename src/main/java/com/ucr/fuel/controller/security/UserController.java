package com.ucr.fuel.controller.security;

import com.ucr.fuel.dto.security.LoginDTO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;
import java.util.Base64;

//@RestController
//@CrossOrigin
public class UserController {

    @RequestMapping("/login")
    public boolean login(@RequestBody LoginDTO user) {
        return
                user.getUserName().equals("user") && user.getPassword().equals("password");
    }

    @RequestMapping("/user")
    public Principal user(HttpServletRequest request) {
        String authToken = request.getHeader("Authorization")
                .substring("Basic".length()).trim();
        return () -> new String(Base64.getDecoder()
                .decode(authToken)).split(":")[0];
    }
}