package com.bootcamp.businessclient.controller;


import com.bootcamp.businessclient.entity.ClientEntity;
import com.bootcamp.businessclient.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/clients")
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @GetMapping
    private Flux<ClientEntity> getAllClients() {
        return clientRepository.findAll();
    }

    @GetMapping("/{id}")
    private Mono<ClientEntity> getClientById(@PathVariable String id) {
        return clientRepository.findById(id);
    }

    @PostMapping("/update")
    private Mono<ClientEntity> update(@RequestBody ClientEntity clientEntity) {
        return clientRepository.save(clientEntity);
    }


}
