package ejerciciosCadenas

fun main() {
    /* Ejercicio 6
     Comprueba que 2 textos son iguales independientemente de si son mayusculas o no

     Ejemplo:
     "Hola" "hola" -> true
     "MAR", "SDW") -> false*/


    println("Escribe una texto")
    var texto1 = readln()

    println("Escribe una texto")
    var texto2 = readln()
    
    var resultado = isIguales(texto1, texto2)
    println(resultado)



}

fun isIguales(texto1: String, texto2: String): Boolean {
    return texto1.equals(texto2,ignoreCase = true,)


}