# ARSW-Parcial-Corte1
## Hecho por Alejandro Prieto Reyes

---

### Explicacion de mi razonamiento _(Ya que la verdad, me quede en blanco)_:
#### API de usuarios
1. Buscaba crear usuarios (Que iba a guardar en un SQL), donde guardara el nombre, correo y apiKey del mismo.
2. Esta api, lo que hacia era validar que el usuario estuviera dentro de la sesion y ya. Esto para que el usuario pusiera su APIKEY 1 vez y ya las veces que este pidiera o iniciara sesion para solicitar, esta se le pone en la peticion sin problema

#### API de Peticiones
1. Buscaba Hacer una api, que recibiera una peticion que se "crea" gracias a mi clase peticion, la cual recibe los parametros necesarios y no necesarios para realizar una peticion segun la api. Entonces ahi el api realizaba la transformacion de la peticion en el formato que se debe realizar y enviaba la peticion.
2. Cuando recibiamos la respuesta a nuestra peticion enviada por la "api", nosotros se la pasabamos al cliente en el formato JSON, tipo, nosotros no haciamos nada mas que mandar peticion y lo que nos diera devolverlo al cliente si era en un HTTP.STATUS correcto, ya para que el front fuera el que la maneja


#### FRONT
1. Primera Interfaz: Pensaba hacer un front, con lo primero siempre fuera el login, donde podia iniciar sesion o crear cuenta, esto para ingresar o crear usuario
2. Segunda Interfaz: Donde le aparecian las opciones al usuario (True o False) para booleanas, calendario para fecha, lo mismo que combobox para las que son "estaticas" y un boton que de a enviar. (Este valida si las obligatorias estan seleccionadas)
3. Tercera Interfaz: Donde el usuario puede ver una tabla con los datos **(Esto si no se ni que libreria usar _Usamos una en CVDS pero no me acuerdo cual_)**, y asi el usuario poder visualizar esto. Aca puede manipular tambien los parametros de la peticion, para que el usuario pueda consultar facilmente que es lo que quiere. Gracias a la tabla, sacamos un grafico de dispersion, que relacione las variables, para marcar lineas de tendencia y asi, saber si invertir o no

