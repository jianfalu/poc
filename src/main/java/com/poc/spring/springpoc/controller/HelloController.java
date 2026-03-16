package com.poc.spring.springpoc.controller;
 
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {
@GetMapping("/hello")
  public Greeting greeting() {
    return new Greeting(1l, "Hello 123");
  }
}
