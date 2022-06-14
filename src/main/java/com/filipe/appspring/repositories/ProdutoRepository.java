package com.filipe.appspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.filipe.appspring.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
