package br.pucminas.ec.gestor_estoque_pereciveis.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Entity
@Getter
@Setter
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Integer quantidade;
    private LocalDate validade;

    public Produto() {
    }

    @Transient
    public String getStatusValidade() {
        long diasRestantes = ChronoUnit.DAYS.between(LocalDate.now(), validade);

        // --Alertas simplificados para data de vencimento
        if (validade == null) { return "Sem validade."; }
        if(diasRestantes < 0) { return "Produto expirado."; }
        if(diasRestantes <= 7){ return "Expira em breve: " + diasRestantes + " dias."; }

        return "Em dia";
    }
}
