package br.com.unibave.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/boletos")
public class BoletoController {

    @PostMapping("/gerar")
    public String gerarBoleto(){
        return "Boleto gerado";
    }
}
