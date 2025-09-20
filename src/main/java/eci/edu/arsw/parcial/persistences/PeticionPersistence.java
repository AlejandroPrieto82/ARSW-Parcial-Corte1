package eci.edu.arsw.parcial.persistences;

import java.util.Date;

import eci.edu.arsw.parcial.model.types.TypeDataType;
import eci.edu.arsw.parcial.model.types.TypeOutputSize;

public interface PeticionPersistence {
    
    Object sendPeticion (String function, String symbol, String interval, String apiKey, Boolean adjusted, Boolean extendedHours, Date month, TypeOutputSize outputSize, TypeDataType dataType) throws PeticionException;
    
    
    

}
