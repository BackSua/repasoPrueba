package com.example.repasoprueba.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table (name = "Continentes")
public class Continente {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    @NotEmpty
    @Column(name = "codigo")
    private String codigo;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name="estado")
    private boolean estado;
}
