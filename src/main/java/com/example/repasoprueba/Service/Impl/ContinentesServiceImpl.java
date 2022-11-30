package com.example.repasoprueba.Service.Impl;

import com.example.repasoprueba.Entity.Continente;
import com.example.repasoprueba.Repository.ContinenteRepository;
import com.example.repasoprueba.Service.ContinenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContinentesServiceImpl implements ContinenteService {

    @Autowired
    private ContinenteRepository continenteRepository ;

    //Implementacion del metodo listar
    @Override
    public ResponseEntity<Object> ListarContinentes() {
        try {
            List<Continente> continentes = continenteRepository.findAll();
            if (continentes.isEmpty()){
                return ResponseEntity.notFound().build();
            }
            return ResponseEntity.ok(continentes);
        }catch (Exception e){
            System.out.println("ERROR"+e);
        }
        return null;
    }
}
