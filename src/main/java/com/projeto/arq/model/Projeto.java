package com.projeto.arq.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@AllArgsConstructor
@Document(collection = "projeto")
public class Projeto implements Serializable {
    static final long serialVersionUID = 1L;
    @Id
    private String id;
    private String rrt;
    private String endereco;
    private Arquiteto arquiteto;
    private Cliente cliente;
    private String url;
}
