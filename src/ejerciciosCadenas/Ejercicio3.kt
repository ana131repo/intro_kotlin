package ejerciciosCadenas

fun main() {
    /* Ejercicio 3
     Crea una función que dado una frase borra el carácter que se le pasa si la contiene al principio o al final de la frase

     Ejemplo:
     "esta frase es de ejemplo" caracter "o" -> "esta frase es de ejempl"*/

    println("Escribe una texto")
    val texto = readln()

    println("Escribe el caracter que quieres eliminar")
    val eliminar = readln()[0]
    val resultado =  eliminarCaracter(texto, eliminar)
    println(resultado)


}

fun eliminarCaracter(texto: String, eliminar: Char): String {

    var salida = texto.trim()
    if(salida.isEmpty()){
        return " Este texto esta vacio"
    }

    if (salida.startsWith(eliminar)) {
        salida = salida.substring(1)
    }

    if (salida.endsWith(eliminar)) {
        salida = salida.substring(0, salida.length - 1)

    }

    return salida
}
