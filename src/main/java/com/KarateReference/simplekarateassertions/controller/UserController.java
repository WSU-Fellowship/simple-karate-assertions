package com.KarateReference.simplekarateassertions.controller;

import com.KarateReference.simplekarateassertions.User.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/firstUser")
    public ResponseEntity<User> getFirstUser() {
        return ResponseEntity.ok(User.builder().name("Cole").address("3131 Kettering Blvd").age(26).build());
    }


    @GetMapping("/secondUser")
    public ResponseEntity<User> getSecondUser() {
        return ResponseEntity.ok(User.builder().name("Keith").address("3131 Kettering Blvd").age(21).build());
    }

    @GetMapping("/thirdUser")
    public ResponseEntity<User> getThirdUser() {
        return ResponseEntity.status(200).body(User.builder().name("Andy").address("100 Unknown Location St").age(30).build());
    }

    @GetMapping("/badResponseUser")
    public ResponseEntity<User> getBadUser() {
        return ResponseEntity.badRequest().build();
    }

}
