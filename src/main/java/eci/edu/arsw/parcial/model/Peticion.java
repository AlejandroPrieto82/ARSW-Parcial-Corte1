package eci.edu.arsw.parcial.model;

import java.util.Date;

import eci.edu.arsw.parcial.model.types.TypeDataType;
import eci.edu.arsw.parcial.model.types.TypeOutputSize;
import io.micrometer.common.lang.Nullable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Peticion {
    //Estas son las cosas obligatorias para hacer la peticion
    private String function;
    private String symbol;
    private Integer interval;
    private String apiKey;


    //Estas son las cosas no obligatorias para hacer la peticion
    @Nullable
    private Boolean adjusted;
    @Nullable
    private Boolean extendedHours;
    @Nullable
    private Date month;
    @Nullable
    private TypeOutputSize outputSize;
    @Nullable
    private TypeDataType dataType;


}
