package com.filipe.appspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.filipe.appspring.domain.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

}
