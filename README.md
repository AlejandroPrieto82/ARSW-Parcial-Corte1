# ARSW-Parcial-Corte1
## Hecho por Alejandro Prieto Reyes

---

### Explicacion de mi razonamiento _(Ya que la verdad, me quede en blanco)_:
#### API de usuarios
1. Buscaba crear usuarios (Que iba a guardar en un SQL), donde guardara el nombre, correo y apiKey del mismo. (Esto tambien va con contraseña, pero para el ejericio no lo pense)
2. Esta api, lo que hacia era validar que el usuario estuviera dentro de la sesion y ya. Esto para que el usuario pusiera su APIKEY 1 vez y ya las veces que este pidiera o iniciara sesion para solicitar, esta se le pone en la peticion sin problema. 

#### API de Peticiones
1. Buscaba Hacer una api, que recibiera los parametros para realizar una peticion, la cual recibe los parametros necesarios y no necesarios para realizar una peticion segun la api. Entonces ahi el api realizaba la transformacion de la peticion en el formato que se debe realizar y enviaba la peticion al front nuevamente, para que este ya con la peticion creada, realize la peticion desde el navegador y asi mismo, obtenga los datos y los transforme.


#### FRONT
1. Primera Interfaz: Pensaba hacer un front, con lo primero siempre fuera el login, donde podia iniciar sesion o crear cuenta, esto para ingresar o crear usuario
2. Segunda Interfaz: Donde le aparecian las opciones al usuario (True o False) para booleanas, calendario para fecha, lo mismo que combobox para las que son "estaticas" y un boton que de a enviar. (Este valida si las obligatorias estan seleccionadas)
3. Tercera Interfaz: Donde el usuario puede ver una tabla con los datos **(Esto si no se ni que libreria usar _Usamos una en CVDS pero no me acuerdo cual_)**, y asi el usuario poder visualizar esto. Aca puede manipular tambien los parametros de la peticion, para que el usuario pueda consultar facilmente que es lo que quiere. Gracias a la tabla, sacamos un grafico de dispersion, que relacione las variables, para marcar lineas de tendencia y asi, saber si invertir o no
**NOTA:** Esta parte del front, es la que envia y luego recibe la peticion del api de peticiones, para ella buscar con el nuevo link enviado y asi, poder transformar los datos para lo que necesite    


**NOTA 2:** Podriamos igualmente, hacer un front, que transforme con los datos obtenidos el mismo los datos en el link, la diferencia es que seria abrir un cuadro de texto, para que manualmente este ponga su _APIkey_ y  realice las busquedas que quiera, esto para no gastar recursos en tener un API de peticiones funcionando, y asi, dejar un cliente grueso, el cual funcione para realizar todo esto, y la empresa solo tenga el front en un cloudFront y un S3 conectados, para no gastar tantos recursos.   

**NOTA 3:** La unica documentacion que tengo, la puse en el codigo, no la tengo en esto, ya que la verdad, es poco y no creo que este bien, igualmente **Pido perdon no ser capaz de resolver esto actualmente, me comprometo a mejoraren el segundo corte**