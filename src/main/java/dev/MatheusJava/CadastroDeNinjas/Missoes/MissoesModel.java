package dev.MatheusJava.CadastroDeNinjas.Missoes;

import dev.MatheusJava.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity // Define classe abaixo como entidade no banco de dados
@Table(name = "tb_missoes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Gera o Id sequencialmente na tabela
    private Long id;
    private String nome;
    private  String rankin;

    private NinjaModel ninja;

    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;

}
