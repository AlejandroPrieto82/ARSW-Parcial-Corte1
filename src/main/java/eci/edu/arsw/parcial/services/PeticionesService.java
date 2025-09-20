package eci.edu.arsw.parcial.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eci.edu.arsw.parcial.model.types.TypeDataType;
import eci.edu.arsw.parcial.model.types.TypeOutputSize;
import eci.edu.arsw.parcial.persistences.PeticionException;
import eci.edu.arsw.parcial.persistences.PeticionPersistence;

@Service
public class PeticionesService {
    
    @Autowired
    private PeticionPersistence peticionPersistence;

    public Object sendPeticion (String function, String symbol, String interval, String apiKey, Boolean adjusted, Boolean extendedHours, Date month, TypeOutputSize outputSize, TypeDataType dataType) throws PeticionException{
        
        

    }

}
