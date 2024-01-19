package ea.slartibartfast.handsonspringbootgradle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HandsOnSpringBootGradleApplication {

    public static void main(String[] args) {
        SpringApplication.run(HandsOnSpringBootGradleApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

}
