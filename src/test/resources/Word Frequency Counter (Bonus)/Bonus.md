1 Complejidad computacional del algoritmo
•	Lectura del archivo: O(n)
•	Contar palabras y caracteres: O(k)
•	Ordenamiento: O(p log p)
Entonces, la complejidad total es aproximadamente O(n + k + p log p). En el peor de los casos, si n es muy grande y p ≈ k, el ordenamiento puede ser el paso más costoso.
a.	Lectura del archivo línea por línea: 
-	La lectura del archivo por medio de BufferedReader y recorre cada línea da una complejidad de O(n), siendo n el numero de caracteres del archivo.
-	Se calcula el tiempo O(m) siendo m el número de palabas en la línea para contar caracteres y dividir palabras.
b.	Conteo de palabras y caracteres:
-	Acceder y actualizar un HashMap tiene un costo promedio de O(1).
c.	Ordenar por frecuencia las palabras:
-	La ordenación se calcula por medio de O(p log p), p es el número de palabras únicas del archivo.

2 Complejidad computacional del algoritmo
-	Procesamiento en paralelo del archivo: Al tener archivos grandes se podrían procesar los archivos en paralelo, se separan en bloques los archivos y se podría usar ConcurrenthashMap en ves de HashMap y porcesarlo en hilos multiples.
-	Generar una limpieza de las palabras y eliminar caracteres innecesarios como puntuaciones , ej Split (“\\W+”)
