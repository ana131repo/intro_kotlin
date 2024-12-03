package ejerciciosCadenas

fun main() {
    /* Ejercicio 3
     Crea una función que dado una frase borra el carácter que se le pasa si la contiene al principio o al final de la frase

     Ejemplo:
     "esta frase es de ejemplo" caracter "o" -> "esta frase es de ejempl"*/

    println("Escribe una texto")
    var texto = readln()

    println("Escribe el caracter que quieres sustituir")
    var eliminar = readln()[0]
    eliminarCaracter(texto, eliminar)


}

fun eliminarCaracter(texto: String, eliminar: Char): String {
    if (texto.startsWith(eliminar)) {
        println(texto.substring(1))

    }
    if(texto.endsWith(eliminar)) {
        println(texto.substring(0, texto.length - 1))
    }

    return texto

}
