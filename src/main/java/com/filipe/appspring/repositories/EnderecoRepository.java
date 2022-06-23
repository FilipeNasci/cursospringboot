package com.filipe.appspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.filipe.appspring.domain.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {

}
