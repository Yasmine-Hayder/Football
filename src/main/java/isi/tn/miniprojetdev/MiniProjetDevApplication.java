package isi.tn.miniprojetdev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "isi.tn")
@SpringBootApplication
public class MiniProjetDevApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiniProjetDevApplication.class, args);
    }

}
