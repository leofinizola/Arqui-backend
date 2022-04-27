package com.projeto.arq.service;

import com.projeto.arq.model.Arquiteto;
import com.projeto.arq.repository.ArquitetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArquitetoService {
    @Autowired
    private ArquitetoRepository arquitetoRepository;

    public ResponseEntity<Arquiteto> save(Arquiteto arquiteto){
        try{
            Arquiteto savedArq = arquitetoRepository.save(arquiteto);
            return ResponseEntity.ok(savedArq);
        }
        catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    public ResponseEntity<List<Arquiteto>> getAll(){
        try{
            List<Arquiteto> arqs = arquitetoRepository.findAll();
            return ResponseEntity.ok(arqs);
        }
        catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    public ResponseEntity<?> delete(Arquiteto arquiteto){
        try{
            arquitetoRepository.delete(arquiteto);
            return ResponseEntity.ok().build();
        } catch (Exception e){
            return ResponseEntity.badRequest().build();
        }
    }
}
