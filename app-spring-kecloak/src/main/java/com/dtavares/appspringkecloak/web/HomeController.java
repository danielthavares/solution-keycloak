package com.dtavares.appspringkecloak.web;

import java.security.Principal;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping()
    public ResponseEntity<String> get() {
        return ResponseEntity.ok("home");
    }

    @GetMapping("user")
    public ResponseEntity<String> getUser(Principal principal) {
        return ResponseEntity.ok("user");
    }

    @GetMapping("admin")
    public ResponseEntity<String> getAdmin() {
        return ResponseEntity.ok("admin");
    }

    @GetMapping("all")
    public ResponseEntity<String> getAll() {
        return ResponseEntity.ok("all");
    }
}
