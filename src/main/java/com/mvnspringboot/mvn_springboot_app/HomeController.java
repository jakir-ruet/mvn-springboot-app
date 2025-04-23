package com.mvnspringboot.mvn_springboot_app;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HomeController {
   @GetMapping("/home")
   public String Home() {
      return "Welcome Maven Spring Boot Web Application";
   }
}
