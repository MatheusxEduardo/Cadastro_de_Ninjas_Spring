package dev.MatheusJava.CadastroDeNinjas.Ninjas;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NinjaService {

    private static final Logger logger = LoggerFactory.getLogger(NinjaService.class);
    private final NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    public List<NinjaModel> listarNinjas() {
        logger.debug("Iniciando a listagem de ninjas...");
        try {
            List<NinjaModel> ninjas = ninjaRepository.findAll();
            logger.debug("Ninjas recuperados: {}", ninjas);
            logger.debug("Listagem concluída com sucesso. Total de ninjas: {}", ninjas.size());
            return ninjas;
        } catch (Exception e) {
            logger.error("Erro ao listar ninjas: {}", e.getMessage(), e);
            throw new RuntimeException("Erro ao listar ninjas: " + e.getMessage(), e);
        }
    }
}