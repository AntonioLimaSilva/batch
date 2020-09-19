package br.com.luciano.batch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BatchApplication {

    public static void main(String[] args) {
        SpringApplication.run(BatchApplication.class, args);

        System.exit(SpringApplication.exit(SpringApplication.run(BatchApplication.class, args)));
    }

}
