Reporte Bug 1 - Textos compuestos por caracteres especiales y números son contados en unas secciones como palabras y en sección "Keyword Density" no se reconocen como palabras

Ambiente: https://wordcounter.net/
Fecha y hora:  3/11/2024, 6:50 pm
usuario: Genérico entregado para la prueba

Pasos:

- El usuario ingresa a la página https://wordcounter.net/
- El usuario digita la sentencia "My syster are syster , but the thoseeeeeffffff dfffff ffff &&&&&& 88888  xxxxxx ccccc" en el campo de texto "WordCounter"
- En el resumen general se evidencia que se encuentran 13 palabras y 85 caracteres
- En la sección "Details" se evidencia 13 palabras y 85 caracteres
- Se evidencia que la sentencia "88888" del texto ingresado fue contado como una palabra
- Al verificar en la sección "Keyword Density" no se encuentra en el conteo de palabras repetidas el texto "88888" , con lo cual se evidencia que para unos conteos este texto se toma como una palabra
 y para otro conteo no se tiene en cuenta. Lo mismo sucede para el texto "&&&&&&"
--------

Reporte Bug 2 – La palabra “but” no es reconocida en la sección "Keyword Density" como una palabra y no se tiene en cuenta en los porcentajes

Ambiente: https://wordcounter.net/
Fecha y hora:  3/11/2024, 6:50 pm
usuario: Genérico entregado para la prueba

Pasos:

- El usuario ingresa a la página https://wordcounter.net/
- El usuario digita la sentencia "My syster are syster , but the thoseeeeeffffff dfffff ffff &&&&&& 88888  xxxxxx ccccc" en el campo de texto "WordCounter"
- En el resumen general se evidencia que se encuentran 13 palabras y 85 caracteres
- En la sección "Details" se evidencia 13 palabras y 85 caracteres
- Se evidencia que la palabra "but" del texto ingresado fue contado como una palabra
- Al verificar en la sección "Keyword Density" no se encuentra en el conteo de palabras, con lo cual se evidencia que para unos conteos este texto se toma como una palabra
 y para otro conteo no se tiene en cuenta. 
