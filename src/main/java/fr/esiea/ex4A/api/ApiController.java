package fr.esiea.ex4A.api;

import org.springframework.web.bind.annotation.*;

@RestController
public class ApiController {
    @PostMapping("/api/inscription")
    public void inscription(@RequestBody User user){
        System.out.println(user.toString());
    }

    @GetMapping("/api/matches")
    public void matchesUser(@RequestParam(value="userName") String name, @RequestParam(value="userCountry") String country){
        System.out.println("ok");
    }
}
