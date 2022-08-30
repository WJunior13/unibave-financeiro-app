package br.com.unibave.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demonstrativos")
public class DemonstrativoController {

    @PostMapping
    public String processar(){
        return "Demonstrativo Salvo";
    }
}
