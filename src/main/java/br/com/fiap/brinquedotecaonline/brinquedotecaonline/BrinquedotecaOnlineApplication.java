package br.com.fiap.brinquedotecaonline.brinquedotecaonline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class BrinquedotecaOnlineApplication {

    public static void main(String[] args) {
        SpringApplication.run(BrinquedotecaOnlineApplication.class, args);
    }


}
