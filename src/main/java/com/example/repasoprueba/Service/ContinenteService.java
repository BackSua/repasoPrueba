package com.example.repasoprueba.Service;

import org.springframework.http.ResponseEntity;

public interface ContinenteService {
    //Metodo que permite consultar un listado de continentes
    ResponseEntity<Object> ListarContinentes();


}
