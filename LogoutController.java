package com.mydata.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LogoutController {

 @GetMapping("/logout")
 public String showlogoutPage() {
     return "logout";
 }
}
