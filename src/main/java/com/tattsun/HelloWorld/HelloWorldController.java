package com.tattsun.HelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@RestController
public class HelloWorldController {
    @GetMapping("/hello")
    public String helloWorld() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年M月d日H時m分s秒");
        String formattedDateTime = now.format(formatter);
        return "Hello World! 現在時刻は、" + formattedDateTime + "です。";
    }
}

