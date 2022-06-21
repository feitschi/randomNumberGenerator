package com.example.randomNumberGenerator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class Controller {

  Service service = new Service();

    @GetMapping("/sum")
    public int sum(@RequestParam int a, @RequestParam int b) {
        return service.sum(a,b);
    }

}
