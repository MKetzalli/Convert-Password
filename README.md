# Convert-Password

![Captura](https://user-images.githubusercontent.com/55233980/149175966-f32fb544-6c5b-4c5f-9eba-fbf3e9000ef8.PNG)

DESCRIPCION: solicita mensaje de texto comun y lo pasa por medio de 5 filtros diferentes para cifrarlo y que al obtener el resultado
sea imposible comprender el mensaje original, enseguida pregunta que mensaje se desea desencriptar, si se escribe 
un mensaje codificado valido entonces este es devuelto descodificado, el contenido de los mensajes debe ser corto

NOTA1: por ahora no se pueden incluir signos ya que estos cambian el resultado y lo volverian imposible de traducir de vuelta

NOTA2: si se ingresan numeros se debe ingresar por lo menos una letra, ya que al volverlas minusculas si no se detectan letras en la cadena marca error

## FILTROS
- filtro 1: cambia el valor de letras y numeros
- filtro 2: cambia el valor de letras por numeros y viceversa
- filtro 3: toma los valores de numeros y los pasa al final del arreglo
- filtro 4: divide el mensaje en arreglos, los numeros se operan, se giran y se unen los arreglos
- filtro 5: los numeros cambian sus valores nuevamente

## Historial de versiones
- version 1: funcionamiento general 19/06/2019
- version 2: gui basica 26/06/2019

## Cambios a realizar
- optimizacion del codigo
