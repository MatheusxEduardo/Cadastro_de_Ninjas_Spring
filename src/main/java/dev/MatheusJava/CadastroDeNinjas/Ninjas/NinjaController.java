package dev.MatheusJava.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasvindas() {
        return "1 Mensagem nesta rota... Bem Vindo! ";
    }

    // Add Ninja (CREATE)
    @PostMapping("/criar")
    public String criarNinja() {
        return "Ninja Criado.";
    }
    // Show Ninja (READ)
    @GetMapping("/listar ")
    public String MostrarTodosOsNinjas(){
        return "Mostrar Ninja.";
    }
    // Show ninja for id (READ)
    @GetMapping("/listarID")
    public String MostrarTodosOsNinjasPorId(){
        return "Mostrar Ninja Por Id";
    }
    // Modify Ninja data (UPDATE)
    @PutMapping("/alterarID")
    public String AlterarNinjaPorId(){
        return "Alterar Ninja Por Id";
    }
    // Ninja deletr (DELETE)
    @DeleteMapping("/deletarID")
    public String DeletarNinjaPorId(){
        return "Ninja deletado por id";
    }
}
