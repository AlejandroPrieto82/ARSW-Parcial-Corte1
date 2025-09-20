package eci.edu.arsw.parcial.services;

import java.util.Date;

import org.springframework.stereotype.Service;

import eci.edu.arsw.parcial.model.Usuario;
import eci.edu.arsw.parcial.model.types.TypeDataType;
import eci.edu.arsw.parcial.model.types.TypeFunction;
import eci.edu.arsw.parcial.model.types.TypeOutputSize;
import eci.edu.arsw.parcial.model.types.TypeSimbol;

@Service
public class PeticionesService {
    
    //Aca es donde se arma la peticion
    public void sendPeticion (Usuario usuario ,TypeFunction function, TypeSimbol symbol, Integer interval, String apiKey, Boolean adjusted, Boolean extendedHours, Date month, TypeOutputSize outputSize, TypeDataType dataType) throws PeticionException{
        
        String link = "https://www.alphavantage.co/query?";
        link = link + "function="+function.toString() +"&";
        link = link + "symbol="+symbol+"&";
        if(interval <= 0){
            link = link + "interval=60min&";
        }else{
            link = link + "interval="+interval+"min&";
        }

        if(adjusted){
            link = link + "adjusted=true&";
        }
        if(extendedHours){
            link = link + "extended_hours=true&";
        }
        if(month != null){
            link = link + "month="+ Integer.toString(month.getYear())+"-"+Integer.toString(month.getMonth())+"&";
        }
        if(outputSize != null){
            link = link + "outputsize="+outputSize.toString()+"&";
        }
        link = link + "datatype=json&apikey="; //Esto por si en algun momento el default deja de ser Json lo "obligo" a ser "Json"
        link = link + usuario.getAPIkey(); //Aca uno el apiKey del usuario con el link

    }

}
