# language: es
Característica: Como usuario deseo validar la cantidad de caracteres que ingreso

  @Caracteres @All
  Esquema del escenario: Validar la cantidad de caracteres ingresados por el usuario
    Dado El usuario abre la pagina wordcounter
    Cuando El usuario ingresa el "<texto>" a verificar
    Entonces El usario  visualiza la cantidad de caracteres a verificar "<cantida_caracteres>" en resumen general
    Y El usuario visualiza cantidad de caracteres "<cantida_caracteres>"en seccion detalle

    Ejemplos:
      | texto                                                                                                    | cantida_caracteres |
      | Hello the text is...                                                                                     | 20                 |
      | My syster is syster , but                                                                                | 25                 |
      | My syster are syster , but the thoseeeeeffffff dfffff fffff ggggg ddddddd d f f , . .%%% , ;;;; n n hhhh | 104                |