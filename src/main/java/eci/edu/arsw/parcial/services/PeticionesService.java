package eci.edu.arsw.parcial.services;

import org.springframework.stereotype.Service;

import eci.edu.arsw.parcial.model.Respuesta;
import eci.edu.arsw.parcial.model.Usuario;
import eci.edu.arsw.parcial.model.types.TypeDataType;
import eci.edu.arsw.parcial.model.types.TypeFunction;
import eci.edu.arsw.parcial.model.types.TypeOutputSize;
import eci.edu.arsw.parcial.model.types.TypeSimbol;

@Service
public class PeticionesService {
    
    //ACA SE ARMA LA PETICION
    //**ACA HAY MUCHOS IF'S PORQUE COMO COSAS PUEDENSER NULL, NO HAY PROBLEMA, SE VALIDA Y VERIFICA PARA ARMARLO**
    public Respuesta getLink (Integer usuarioID ,TypeFunction function, TypeSimbol symbol, Integer interval, Boolean adjusted, Boolean extendedHours, Integer month, Integer year, TypeOutputSize outputSize, TypeDataType dataType) {
        String link = "https://www.alphavantage.co/query?";
        link = link + "function="+function.toString() +"&";
        link = link + "symbol="+symbol+"&";


        if(interval <= 0){
            link = link + "interval=60min&";
        }else{
            link = link + "interval="+Integer.toString(interval) +"min&";
        }

        if(adjusted){
            link = link + "adjusted=true&";
        }
        if(extendedHours){
            link = link + "extended_hours=true&";
        }
        if(month != null){
            link = link + "month="+ Integer.toString(year)+"-"+Integer.toString(month)+"&";
        }
        if(outputSize != null){
            link = link + "outputsize="+outputSize.toString()+"&";
        }
        link = link + "datatype=json&apikey="; //Esto por si en algun momento el default deja de ser Json lo "obligo" a ser "Json"
        Usuario usuario = new Usuario(1, "Demo", "demo@nosequemepaso.com", "demo","password"); //Aca obtengo usuario buscandolo por el id, en este caso solo lo creo para ejercicio
        link = link + usuario.getAPIkey(); //Aca uno el apiKey del usuario con el link
        Respuesta res = new Respuesta(link);
        return res;
    }

}
