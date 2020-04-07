package iota_example;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class App {
    @RequestMapping("/")
    public String index() {
        return "Hello Spring Boot!";
    }

    public static void main(String[] args) {
      SpringApplication.run(App.class, args);
    }
}