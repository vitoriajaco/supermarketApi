package com.demo.model;

import com.demo.enums.Categoria;
import jakarta.persistence.*;

@Entity
public class ProdutoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private Double preco;

    private int quantidade;

    private String marca;

    private Categoria categoria = Categoria.SEM_CATEGORIA;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
