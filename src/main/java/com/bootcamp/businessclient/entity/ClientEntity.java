package com.bootcamp.businessclient.entity;

import lombok.Data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(value = "clients")
public class ClientEntity {

    @Id
    private String id;
    private String name;
    private String surname;
    private Double account;

}
