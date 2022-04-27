package com.projeto.arq.repository;

import com.projeto.arq.model.Arquiteto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArquitetoRepository extends MongoRepository<Arquiteto, String> {
}
