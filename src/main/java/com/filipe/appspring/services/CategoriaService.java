package com.filipe.appspring.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.filipe.appspring.domain.Categoria;
import com.filipe.appspring.repositories.CategoriaRepository;
import com.filipe.appspring.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> categoria = repo.findById(id);
		return categoria.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! id: " + id + ", Tipo: " + Categoria.class.getName()));
	}
}
