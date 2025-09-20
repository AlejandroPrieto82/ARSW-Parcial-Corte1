package eci.edu.arsw.parcial.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import eci.edu.arsw.parcial.model.Respuesta;
import eci.edu.arsw.parcial.model.types.TypeDataType;
import eci.edu.arsw.parcial.model.types.TypeFunction;
import eci.edu.arsw.parcial.model.types.TypeOutputSize;
import eci.edu.arsw.parcial.model.types.TypeSimbol;
import eci.edu.arsw.parcial.services.PeticionesService;

@RestController
@RequestMapping("/peticiones")
public class PeticionController {
    @Autowired
    private PeticionesService peticionesService;

    //ACA SE RECIBE PARA ENVIAR AL SERVICE
                    
    @GetMapping("/crear/{usuarioID}/{function}/{symbol}/{interval}/{adjusted}/{extendedHours}/{year}/{month}/{outputSize}/{dataType}")
    public ResponseEntity<Respuesta> getLink(@PathVariable String usuarioID ,@PathVariable String function, @PathVariable String symbol,@PathVariable String interval,@PathVariable  String adjusted,@PathVariable  String extendedHours,@PathVariable  String year,@PathVariable  String month,@PathVariable  String outputSize,@PathVariable  String dataType){
        try {
            Respuesta respuesta = peticionesService.getLink(Integer.getInteger(usuarioID), TypeFunction.valueOf(function) , TypeSimbol.valueOf(symbol),15, Boolean.getBoolean(adjusted) , Boolean.getBoolean(extendedHours),Integer.getInteger(month) ,Integer.getInteger(year), TypeOutputSize.valueOf(outputSize), TypeDataType.valueOf(dataType));
            return new ResponseEntity<>(respuesta, HttpStatus.ACCEPTED);
            
        } catch (Exception e) {
            //Respuesta respuesta = new Respuesta("https://www.alphavantage.co/query?function=TIME_SERIES_INTRADAY&symbol=IBM&interval=5min&month=2009-01&outputsize=full&apikey=demo");
            //ENVIO LA DEMO PARA QUE AL MENOS SE VEA ALGO DONDE EL USUARIO
            Respuesta respuesta = new Respuesta("Mal envio de parametros");
            return new ResponseEntity<>(respuesta, HttpStatus.BAD_REQUEST);
        } 
    }

}
