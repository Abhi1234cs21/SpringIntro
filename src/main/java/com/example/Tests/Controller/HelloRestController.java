package com.example.Tests.Controller;

import com.example.Tests.dto.UserDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloRestController {

    // GET Request
    @GetMapping
    public String getHelloMessage() {
        return "Hello from BridgeLabz";
    }

    // GET Request with Query Parameter
    @GetMapping("/query")
    public String getPersonalizedHello(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    @GetMapping("/params/{name}")
    public String sayHelloPathVariable(@PathVariable String name) {
        return "Hello " + name + " from Bridgelabz";
    }
    // Post Request
    // http://localhost:8080/hello/post (Hello Abhishek Adjariya from BridgeLabz)
    @PostMapping("/post")
    public String sayHelloPost(@RequestBody UserDTO user){
        return "Hello " + user.getFirstName()+" "+user.getLastName()+" from Bridgelabz";
    }
    // PUT request with query parameter and params as path
    // http://localhost:8080/hello/put/Abhishek?lastName=Adjariya (Hello Abhishek Adjariya from BridgeLabz)
    @PutMapping("/put/{firstName}")
    public String sayHelloPut(@PathVariable String firstName, @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
}
}




