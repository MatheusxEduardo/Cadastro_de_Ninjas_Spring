package dev.MatheusJava.CadastroDeNinjas.Ninjas;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasvindas")
    public String boasvindas() {
        return "1 Mensagem nesta rota... Bem Vindo!";
    }

    // Add Ninja (CREATE)
    @PostMapping("/criar")
    public String criarNinja() {
        return "Ninja Criado.";
    }

    // Show Ninja (READ)
    @GetMapping("/listar")
    public ResponseEntity<List<NinjaModel>> listarNinjas() {
        try {
            List<NinjaModel> ninjas = ninjaService.listarNinjas();
            if (ninjas.isEmpty()) {
                return ResponseEntity.ok().body(ninjas); // Retorna lista vazia com 200 OK
            }
            return ResponseEntity.ok(ninjas);
        } catch (Exception e) {
            return ResponseEntity.status(500).body(null); // Retorna 500 em caso de erro
        }
    }

    // Show ninja for id (READ)
    @GetMapping("/listar/{id}")
    public ResponseEntity<NinjaModel> listarNinjasPorId(@PathVariable("id") Long id) {
        try {
            NinjaModel ninja = ninjaService.listarNinjaPorId(id);
            if (ninja == null) {
                return ResponseEntity.notFound().build(); // Retorna 404 se o ninja não for encontrado
            }
            return ResponseEntity.ok(ninja); // Retorna 200 com o ninja
        } catch (Exception e) {
            return ResponseEntity.status(500).build(); // Retorna 500 em caso de erro
        }
    }

    // Modify Ninja data (UPDATE)
    @PutMapping("/alterarID")
    public String alterarNinjaPorId() {
        return "Alterar Ninja Por Id";
    }

    // Ninja delete (DELETE)
    @DeleteMapping("/deletarID")
    public String deletarNinjaPorId() {
        return "Ninja deletado por id";
    }
}