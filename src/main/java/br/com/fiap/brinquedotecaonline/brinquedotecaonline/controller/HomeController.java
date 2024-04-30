package br.com.fiap.brinquedotecaonline.brinquedotecaonline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "brinquedos/brinquedos";
    }
}
