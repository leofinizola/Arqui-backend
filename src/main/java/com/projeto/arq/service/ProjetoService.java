package com.projeto.arq.service;

import com.projeto.arq.model.Projeto;
import com.projeto.arq.repository.ProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjetoService {
    @Autowired
    private ProjetoRepository projetoRepository;

    public ResponseEntity<Projeto> save(Projeto proj){
        try{
            Projeto saved = projetoRepository.save(proj);
            return ResponseEntity.ok(saved);
        }
        catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    public ResponseEntity<List<Projeto>> getAll(){
        try{
            List<Projeto> proj = projetoRepository.findAll();
            return ResponseEntity.ok(proj);
        }
        catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    public ResponseEntity<?> delete(Projeto proj){
        try{
            projetoRepository.delete(proj);
            return ResponseEntity.ok().build();
        } catch (Exception e){
            return ResponseEntity.badRequest().build();
        }
    }
}
