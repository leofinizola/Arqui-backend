package com.projeto.arq.controller;

import com.projeto.arq.model.Cliente;
import com.projeto.arq.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public ResponseEntity<Cliente> save(@RequestBody Cliente cliente){
        return clienteService.save(cliente);
    }

    @GetMapping
    public ResponseEntity<List<Cliente>> getAll(){
        return clienteService.getAll();
    }

    @DeleteMapping
    public ResponseEntity<?> delete(@RequestBody Cliente cliente){
        return clienteService.delete(cliente);
    }
}
