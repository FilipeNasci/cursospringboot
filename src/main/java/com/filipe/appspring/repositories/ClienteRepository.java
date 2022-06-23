package com.filipe.appspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.filipe.appspring.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
