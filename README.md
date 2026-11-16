# 2026_aparcamiento
Ejemplo para practicar atributos y métodos estáticos.

## Enunciado

Un aparcamiento tiene una capacidad de 5 plazas. Esa capacidad es la misma siempre y no puede cambiar mientras el programa se ejecuta, aunque cualquier parte del programa puede consultarla. (De momento el programa no tiene que comprobar si el aparcamiento está lleno.)

De cada coche se guarda su matrícula y los kilómetros que marca su cuentakilómetros. La matrícula de un coche no cambia nunca. Los kilómetros sí aumentan cuando el coche circula. Por normativa, todo vehículo tiene como mínimo 2 ruedas, y ese dato es igual para todos.

Cuando un coche entra, se emite un ticket. Los tickets se numeran de forma correlativa empezando en 0, y cada ticket conserva su propio número. En cualquier momento hay que poder saber cuántos tickets se han emitido en total, incluso antes de que se haya emitido ninguno.

Cuando se registra un coche, se muestra un mensaje con su matrícula y sus kilómetros. Cuando se emite un ticket, se muestra su número.

Qué tiene que hacer el programa principal
- Mostrar la capacidad del aparcamiento, el número mínimo de ruedas y los tickets emitidos, todo ello antes de registrar ningún coche ni emitir ningún ticket.
- Registrar dos coches con los mismos kilómetros. Hacer que solo uno de ellos recorra 100 km y mostrar los kilómetros de ambos.
- Emitir tres tickets y mostrar el número de cada uno.
- Mostrar el total de tickets emitidos.
