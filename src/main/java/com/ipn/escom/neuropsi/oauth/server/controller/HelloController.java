package com.ipn.escom.neuropsi.oauth.server.controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class HelloController {

  @GetMapping("/oauth/hello")
  public Map<String, String> map() {
    Map<String, String> map = new HashMap<>();
    map.put("message", "hello");
    return map;
  }

  @GetMapping("/hello")
  public Map<String, String> mapJust() {
    Map<String, String> map = new HashMap<>();
    map.put("message", "just hello");
    return map;
  }

}
