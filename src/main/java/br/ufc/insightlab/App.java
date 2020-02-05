package br.ufc.insightlab;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableProcessApplication("camunda-spring")
public class App {
  public static void main(String... args) {
    SpringApplication.run(App.class, args);
  }
}
