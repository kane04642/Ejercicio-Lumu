# language: es
Característica: Como usuario deseo validar la cantidad de palabras que ingreso

  @All @Palabras
  Esquema del escenario: Validar la cantidad de palabras ingresadas por el usuario
    Dado El usuario abre la pagina wordcounter
    Cuando El usuario ingresa el "<texto>" a verificar
    Entonces El usario  visualiza la cantidad de palabras a verificar "<cantida_palabras>" en resumen general
    Y El usuario visualiza cantidad de palabras "<cantida_palabras>"en seccion detalle
    Ejemplos:
      | texto                                                                                                    | cantida_palabras |
      | Hello the text is...                                                                                     | 4                |
      | hello hello ffffff fffff ffff                                                                            | 5                |
      | My syster is syster , but                                                                                | 5                |
      | My syster are syster , but the thoseeeeeffffff dfffff fffff ggggg ddddddd d f f , . .%%% , ;;;; n n hhhh | 17               |
      | My syster are syster , but the thoseeeeeffffff dfffff ffff &&&&&& 88888  xxxxxx ccccc                    | 13               |