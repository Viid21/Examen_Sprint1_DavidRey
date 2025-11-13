# Prueba de Java - Sistema de Biblioteca

La biblioteca necesita un sistema para gestionar su inventario de materiales. Cada material puede ser de distintos tipos y algunos tienen información adicional específica de su tipo.


Todos los materiales de la biblioteca cuentan con:  
- **Título**  
- **Autor**  
- **Año de publicación**  

Los materiales pueden ser de distintos tipos:  
- **Revista**, que además cuenta con un número de *release*.  
- **Enciclopedia**, que además cuenta con un número de *tomo*.  
- **Libro**, que no tiene atributos adicionales. 

El sistema debe permitir:

1. Registrar diferentes tipos de materiales con toda su información relevante.
2. Guardar todos los materiales en una colección y poder consultarlos por su título.
3. Lanzar un mensaje de error si se intenta buscar un material que no existe.
4. Listar todos los materiales, y también poder filtrar aquellos publicados después de un año determinado.
5. Mostrar la información de cada material de manera adecuada según su tipo.

**Objetivo:** Aprovecha los conceptos de **herencia, polimorfismo, colecciones, excepciones, genéricos y lambdas** para implementar el sistema de manera eficiente.

**Tiempo:** 45 minutos

> **NO es necesario gestionar inputs y outputs por consola a través de un menú.**
