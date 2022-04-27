package com.projeto.arq.repository;

import com.projeto.arq.model.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository  extends MongoRepository<Cliente, String> {
}
