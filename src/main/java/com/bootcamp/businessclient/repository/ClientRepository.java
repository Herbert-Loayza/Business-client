package com.bootcamp.businessclient.repository;

import com.bootcamp.businessclient.entity.ClientEntity;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ClientRepository extends ReactiveMongoRepository<ClientEntity, String> {
}
