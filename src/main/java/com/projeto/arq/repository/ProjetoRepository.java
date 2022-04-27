package com.projeto.arq.repository;

import com.projeto.arq.model.Projeto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjetoRepository extends MongoRepository<Projeto, String> {
}
