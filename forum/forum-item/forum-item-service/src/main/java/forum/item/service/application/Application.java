package forum.item.service.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication(scanBasePackages = "forum.item.service")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
