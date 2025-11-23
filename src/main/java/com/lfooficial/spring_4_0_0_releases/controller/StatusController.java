package com.lfooficial.spring_4_0_0_releases.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

  @GetMapping(path = "/status", version = "1.0")
  public String status() {
    return "Application is running! In verwion 1.0";
  }

  @GetMapping(path = "/status", version = "2.0")
  public String status2() {
    return "Application is running! In verwion 2.0";
  }
}
