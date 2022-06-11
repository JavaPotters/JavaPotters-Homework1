# JavaPotters-Homework1

## Proyecto de Juego 

### Proyecto realizado por: Laura Zambrano, Sofia de la Fuente, Ana Bermejo y Rocío Arellano

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------


Te damos la bienvenida a nuestro primer proyecto en grupo de Java!!
A continuación te invitamos a conocer qué hemos realizado en nuestro proyecto, y cual ha sido la lógica y forma de trabajo que hemos realizado. 
Esperamos que disfrutes del juego y de nuestro cógido!!

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

#### ¿Te atreves a jugar?
##### ¿Cómo crear equipos y personajes?

- En este proyecto encontrarás un juego cuya dinámica consiste en realizar 2 equipos que pueden contener dos tipos de personajes: `Warriors` y `Wizards`.
Puedes elegir si quieres un equipo personalizado, en el cual tendrás que proveer a cada personaje de `name`, `health points`, `stamina` y `strenght` si es un `Warrior`; así como de `name`, `health points`, `mana` y `intelligence` si es un `Wizard`. 

- También tienes la opción de elegir un equipo que se realiza automáticamente por medio del método random. 

- La tercera opción para elegir equipo, sería usando un documento CSV que ya contiene sus personajes y características. 

Para conseguir llegar hasta este punto en nuestro proyecto de programación hemos creado diferentes clases: 
- `CustomizedProperties`, `RandomProperties` y `CsvReader` que contienen los métodos para crear a nuestros personajes. 
- Y la clase abstracta `Party` de la que extienden `CustomizedParty`, `RandomParty` y `CSVParty`, y en ellas están contenidos los métodos para generar los equipos. 

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

#### ¡¡Qué comience la batalla!! 
##### ¿Cómo se lleva a cabo el proceso de batalla?
Una vez tenemos nuestros equipos y personajes listos aparecen por pantalla los dos equipos y tendrás que seleccionar el `ID` de los dos primeros personajes que quieres que se enfrenten en batalla (uno de cada equipo). 

Durante la batalla:

- Si el personaje atacante es un `Warrior` y realiza un `Heavy attack` el daño que efectua al contrincante es igual a su `strength`, y, además, el propio atacante pierde 5 puntos de su `Stamina`. En cambio, si realiza un `Weak attack` el daño que efectua al contrincante es la mitad de su `strength` y le hace recuperar `Stamina` en 1 punto.
- Si el personaje atacante es un `Wizard` y realiza un `Fireball` el daño que efectua al contrincante es igual a su `intelligence`, y, además, el propio atacante pierde 5 puntos de su `mana`. En cambio, si realiza un `Staff hit` el daño que efectua al contrincante es la mitad de su `intelligence` y le hace recuperar `mana` en 1 punto.

En nuestro proyecto de programación tenemos los métodos de ataques y la parte lógica  de esta sección de ataque en la clase abstracta `Character`de la que extienden las clases `Warrior` y `Wizard`. 

De esta forma cuando realizan el ataque hay un recuento tras cada ronda, y, se nos presentan dos opciones: puede morir un personaje o los dos. 
Cuando un personaje muere se va al cementerio, del que no regresará a la partida. 
Si algún personaje sigue vivo tras la ronda, puede volver a jugar en la siguiente batalla. 

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

#### ¡¡Es hora de conocer quien es el mejor equipo!! 
##### Fin de la batalla:

El juego acaba cuando todos los personajes de un equipo mueren, y, queda algún personaje vivo en el otro equipo. 

Una vez finaliza la partida, veremos en consola que se ha finalizado la batalla y el equipo ganador, así como el cementerio.
Tras finalizar la batalla, además, hemos incluido la función adicional de que se cree un documento CSV con todos los datos de los personajes que se incluyen en el cementerio. 


Por último, indicar que en la clase `Game` encontrarás toda la programación de la parte lógica restante de nuestro juego, hemos decidido incluirla ahí para no sobrecargar la clase `Main`.

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

#### Datos adicionales que nos gustaría que conocieras: 

-El proyecto ha sido realizado por partes iguales por las 4 miembros del grupo, debido a que nuestra dinámica de trabajo ha consistido en realizar reuniones virtuales durante todo el proyecto. No nos hemos dividido el trabajo, sino que lo hemos ido haciendo de forma simultánea en conjunto. Íbamos turnándonos para escribir el código pero el resto del equipo participaba de la escritura del mismo a la vez. 

-Al inicio del proyecto realizamos un diagrama de flujo para tener claro que pasos seguir en la programación, pero, como lo realizamos antes de dar la parte de diagramas en el Bootcamp, podrás notarlo algo diferente a lo estudiado en clase. Encontrarás figuras coloreadas en verde que indican momentos en que se le solicita al usuario escribir algo en consola, y figuras coloreadas en azul que indican métodos del programa. Las figuras coloreadas en blanco indican otras funcionalidades.
Lo adjuntamos en nuestro repositorio como archivo png. Y, te lo mostramos a continuación: 

<p align="center">
    <img src = /src/com/ironhack/Diagram-flow.drawio.png width="350">
</p>

-Para las entradas de datos por consola por parte del usuario, hemos realizado condiciones/bucles para que si el usuario se equivoca o intenta poner otro parámetro no válido en la consola, pueda referirle ese fallo y le de la oportunidad de volver a escribir un dato válido por consola, y, de esta forma que no le saque del juego. 

-Para que te puedas divertir mientras juegas, hemos decidido añadir algunos nombres cómicos a nuestros personajes. Si se te ocurre alguno más, siempre podrás crear tus propios equipos y usar un CSV. Recuerda que: _"En los momentos de crisis solo la imaginación es más importante que el conocimiento"_

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------



Por último nos gustaría agradecerte tu tiempo por probar e interesarte en nuestro proyecto; esperamos haber estado a la altura de lo que se nos pedía y que hayas pasado un tiempo divertido mientras lo revisabas. 










