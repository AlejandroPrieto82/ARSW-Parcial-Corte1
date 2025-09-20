package eci.edu.arsw.parcial.controllers;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    @GetMapping("/crear")
    public ResponseEntity<Respuesta> getLink(@RequestParam Integer usuarioID ,@RequestParam TypeFunction function, @RequestParam TypeSimbol symbol,@RequestParam  Integer interval,@RequestParam  String apiKey,@RequestParam  Boolean adjusted,@RequestParam  Boolean extendedHours,@RequestParam  Date month,@RequestParam  TypeOutputSize outputSize,@RequestParam  TypeDataType dataType){
        try {
            Respuesta respuesta = peticionesService.getLink(usuarioID, function, symbol, interval, apiKey, adjusted, extendedHours, month, outputSize, dataType);
            return new ResponseEntity<>(respuesta, HttpStatus.ACCEPTED);
            
        } catch (Exception e) {
            Respuesta respuesta = new Respuesta("https://www.alphavantage.co/query?function=TIME_SERIES_INTRADAY&symbol=IBM&interval=5min&month=2009-01&outputsize=full&apikey=demo");
            //ENVIO LA DEMO PARA QUE AL MENOS SE VEA ALGO DONDE EL USUARIO
            return new ResponseEntity<>(respuesta, HttpStatus.BAD_REQUEST);
        }
    }

}
