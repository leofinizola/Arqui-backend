package com.projeto.arq.controller;

import com.projeto.arq.model.Arquiteto;
import com.projeto.arq.service.ArquitetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/arquiteto")
public class ArquitetoController {

    @Autowired
    private ArquitetoService arquitetoService;

    @PostMapping
    public ResponseEntity<Arquiteto> save(@RequestBody Arquiteto arquiteto){
        return arquitetoService.save(arquiteto);
    }

    @GetMapping
    public ResponseEntity<List<Arquiteto>> getAll(){
        return arquitetoService.getAll();
    }

    @DeleteMapping
    public ResponseEntity<?> delete(@RequestBody Arquiteto arquiteto){
        return arquitetoService.delete(arquiteto);
    }
}
