package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v/api")
public class TestController {
    @GetMapping
    public String test() {
        return "Hello, World!";
    }

    @GetMapping("/test")
    public String test2() {
        return "Hello, World!2";
    }
}
