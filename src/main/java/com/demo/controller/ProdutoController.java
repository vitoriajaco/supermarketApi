package com.demo.controller;

import com.demo.model.ProdutoModel;
import com.demo.repository.ProdutoRepository;
import com.demo.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/supermarket")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping(path = "/listarProdutos")
    public ResponseEntity<List<ProdutoModel>> mostrarTodosProdutos(){
        return ResponseEntity.ok(produtoService.mostrarTodosProdutos());
    }
}
