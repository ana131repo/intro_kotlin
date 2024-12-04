package ejerciciosCadenas

fun main() {
    /*Ejercicio 5
    Crea una función que dada una frase comprueba que los 2 primeros caracteres son iguales que los 2 últimos

    Ejemplo:
    "este es el texto" -> false*/

    println("Escribe una texto")
    var texto = readln()
    println(comprobacion(texto))



}

fun comprobacion(texto: String):Boolean {
    var dosPrimeros = texto.substring(0, 2)
    var dosUltimos = texto.substring(texto.length - 2)
    if (dosPrimeros == dosUltimos) {
        return true
        //println("Son iguales $dosPrimeros y $dosUltimos")
    } else {
        return false
        //println("Son diferentes $dosPrimeros y $dosUltimos")
    }

}