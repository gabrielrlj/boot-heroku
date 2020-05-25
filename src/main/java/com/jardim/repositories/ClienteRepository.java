package com.jardim.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.jardim.model.Cliente;

public interface ClienteRepository extends MongoRepository<Cliente, String>{

}
