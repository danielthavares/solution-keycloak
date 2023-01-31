package com.dtavares.appspringkecloak2.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {
    
    @GetMapping()
    public ResponseEntity<String> get(){
        return ResponseEntity.ok("home2");
    }

    @GetMapping("user")
    public ResponseEntity<String> getUser(){
        return ResponseEntity.ok("user2");
    }

    @GetMapping("admin")
    public ResponseEntity<String> getAdmin(){
        return ResponseEntity.ok("admin2");
    }

    @GetMapping("all")
    public ResponseEntity<String> getAll(){
        return ResponseEntity.ok("all2");
    }
}
