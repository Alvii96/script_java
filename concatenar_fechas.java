// Procesar fecha_inicio
var fecha_inicio = "01022023"; // Ejemplo de fecha en formato DDMMYYYY
var dia_inicio = fecha_inicio.substring(0, 2); // Los primeros dos caracteres son el día
var mes_inicio = fecha_inicio.substring(2, 4); // Los siguientes dos caracteres son el mes
var año_inicio = fecha_inicio.substring(4, 8); // El año empieza en la posición 4

// Concatenar en el formato YYYYMMDD
var fecha_inicio_id = año_inicio + mes_inicio + dia_inicio;

console.log("Fecha inicio ID: " + fecha_inicio_id);

// Procesar fecha_termino (misma lógica que fecha_inicio)
var fecha_final = "15032024"; // Ejemplo de fecha en formato DDMMYYYY
var dia_termino = fecha_final.substring(0, 2); // Los primeros dos caracteres son el día
var mes_termino = fecha_final.substring(2, 4); // Los siguientes dos caracteres son el mes
var año_termino = fecha_final.substring(4, 8); // El año empieza en la posición 4

// Concatenar en el formato YYYYMMDD
var fecha_termino_id = año_termino + mes_termino + dia_termino;

console.log("Fecha término ID: " + fecha_termino_id);
