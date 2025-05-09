package dev.MatheusJava.CadastroDeNinjas.Missoes;

import dev.MatheusJava.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity // Define classe abaixo como entidade no banco de dados
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Gera o Id sequencialmente na tabela
    private Long id;
    private String nome;
    private  String rankin;

    private NinjaModel ninja;

    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;









    public MissoesModel(Long id, String nome, String rankin, NinjaModel ninja) {
        this.id = id;
        this.nome = nome;
        this.rankin = rankin;
        this.ninja = ninja;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRankin() {
        return rankin;
    }

    public void setRankin(String rankin) {
        this.rankin = rankin;
    }

    public NinjaModel getNinja() {
        return ninja;
    }

    public void setNinja(NinjaModel ninja) {
        this.ninja = ninja;
    }
}
