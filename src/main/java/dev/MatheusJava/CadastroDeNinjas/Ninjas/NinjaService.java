package dev.MatheusJava.CadastroDeNinjas.Ninjas;

import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;
    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

        //Show All ninjas
        public List<NinjaModel> listarNinjas() {
        return ninjaRepositoryA.findAll();
    }



}
