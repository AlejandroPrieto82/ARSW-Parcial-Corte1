package eci.edu.arsw.parcial.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Usuario {

    private Integer id;
    
    private String nombre;
    private String correo;
    private String APIkey;

}
