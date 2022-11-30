package com.example.repasoprueba.Repository;

import com.example.repasoprueba.Entity.Continente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContinenteRepository extends JpaRepository<Continente,Long> {
}
