package com.naver.kiel0103.sonarqube.controller;

import com.naver.kiel0103.sonarqube.controller.dto.TestResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

  @GetMapping("/api/v1/test")
  public ResponseEntity<TestResponse> test() {
    return ResponseEntity.ok(TestResponse.builder()
        .value("test")
        .build());
  }
}
