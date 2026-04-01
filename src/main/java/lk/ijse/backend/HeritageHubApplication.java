// lk/ijse/heritage_hub/HeritageHubApplication.java
package lk.ijse.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class HeritageHubApplication {
    public static void main(String[] args) {
        SpringApplication.run(HeritageHubApplication.class, args);
    }
}