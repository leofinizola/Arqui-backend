package com.projeto.arq.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@AllArgsConstructor
@Document(collection = "cliente")
public class Cliente implements Serializable {
    static final long serialVersionUID = 1L;
    @Id
    private String id;
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private String email;
}
