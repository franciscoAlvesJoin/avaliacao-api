package com.example.avalicao.api.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.avalicao.api.model.Pessoa;


public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

	public Page<Pessoa> findByNomeContaining(String nome, Pageable pageable);
	
	public Boolean existsByCpfCnpj(String cpfCnpj);
	
	public Boolean existsByRg(String rg);
	
}
