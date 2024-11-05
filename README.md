******Automatización WordCounter*******

- Lenguaje Java
- Serenity BDD
- Cucumber
- Maven
- JUnit

- Se crearon dos features en los cuales se separar los comportamientos y algunas validaciones por "palabra" y "caracteres"
1. Caracteres.feature:
   Se validan la cantidad de caracteres en un texto ingresado
2. Palabras.feature:
      Se validan la cantidad de palabras en un texto ingresado

Forma de ejecución:
En la carpeta src/test/java/runners/TestRunner.java, se creó en archivo de ejecución en el cual se pueden ejecutar los features por medio de TAG
de la siguiente forma:
    - Ejecutar todos los casos de prueba: tags = "@all".
    - Ejecutar casos de prueba de caracteres: tags = "@Caracteres".
    - Ejecutar casos de prueba de caracteres: tags = "@Palabras".

Forma de generar reporte Serenity:
    - En la parte derecha en el icono de Maven , en la sección Sereninty da doble click sobre serenity:aggregate, en la carpeta /target se ubica el archivo 
    index.html, en el cual se pueden encontrar los resultados de la ejecución 

*** Reporte Bug´s ****
Se crearon dos bugs en la carpeta src/test/resources/Reporte Bug/Reporte Bug.md, los cuales cuentan con una imagen llamados bus1.png y bug2.png.

**** Word Frequency Counter (Bonus) *****
En el archivo src/test/resources/Word Frequency Counter (Bonus)/Bonus.md , se realiza una breve explicación del ejercicio Word Frequency Counter (Bonus)



