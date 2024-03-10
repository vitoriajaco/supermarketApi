package com.demo.service;

import com.demo.exceptions.ProdutoNotFoundException;
import com.demo.model.ProdutoModel;
import com.demo.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<ProdutoModel> mostrarTodosOsProdutos(){
        if (mostrarTodosOsProdutos().isEmpty()){
            throw new IllegalStateException("Não há produtos cadastrados!");
        }
        return produtoRepository.findAll();
    }

    public Optional<ProdutoModel>buscarProdutoPorId(Long id){
       return produtoRepository.findById(id);

    }

    public ProdutoModel validaSeProdutoExiste(Long id){
        Optional<ProdutoModel> isPresent = produtoRepository.findById(id);
        return isPresent.orElseThrow(()-> new ProdutoNotFoundException("Produto não encontrado!"));
    }
}
