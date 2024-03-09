package com.demo.repository;

import com.demo.model.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Long, ProdutoModel> {
}
