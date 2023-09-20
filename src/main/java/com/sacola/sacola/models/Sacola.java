package com.sacola.sacola.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sacola.sacola.enumeration.FormaPagamento;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@Builder
@Data
@Table(name = "sacola2")
@Entity(name = "sacola2")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@NoArgsConstructor

public class Sacola {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Cliente cliente;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Item> itens;
    private double valorTotal;
    @Enumerated
    private FormaPagamento FormaPagamento;
    private boolean fechada;

}
