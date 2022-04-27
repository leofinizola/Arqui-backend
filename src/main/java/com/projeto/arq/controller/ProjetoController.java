package com.projeto.arq.controller;

import com.projeto.arq.model.Projeto;
import com.projeto.arq.service.ProjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projeto")
public class ProjetoController {

    @Autowired
    private ProjetoService projetoService;

    @PostMapping
    public ResponseEntity<Projeto> save(@RequestBody Projeto projeto){
        return projetoService.save(projeto);
    }

    @GetMapping
    public ResponseEntity<List<Projeto>> getAll(){
        return projetoService.getAll();
    }

    @DeleteMapping
    public ResponseEntity<?> delete(@RequestBody Projeto projeto){
        return projetoService.delete(projeto);
    }
}
