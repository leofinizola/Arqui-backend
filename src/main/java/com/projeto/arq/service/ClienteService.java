package com.projeto.arq.service;

import com.projeto.arq.model.Cliente;
import com.projeto.arq.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public ResponseEntity<Cliente> save(Cliente cliente){
        try{
            Cliente saved = clienteRepository.save(cliente);
            return ResponseEntity.ok(saved);
        }
        catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    public ResponseEntity<List<Cliente>> getAll(){
        try{
            List<Cliente> clientes = clienteRepository.findAll();
            return ResponseEntity.ok(clientes);
        }
        catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    public ResponseEntity<?> delete(Cliente cliente){
        try{
            clienteRepository.delete(cliente);
            return ResponseEntity.ok().build();
        } catch (Exception e){
            return ResponseEntity.badRequest().build();
        }
    }
}
