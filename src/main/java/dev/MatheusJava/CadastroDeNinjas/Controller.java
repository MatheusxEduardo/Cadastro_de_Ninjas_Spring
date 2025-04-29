package dev.MatheusJava.CadastroDeNinjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("/boasvindas")
    public String boasvindas() {
        return "1 Mensagem nesta rota... Bem Vindo! ";
    }

}
