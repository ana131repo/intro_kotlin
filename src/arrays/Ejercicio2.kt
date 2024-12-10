package arrays

fun main() {
    /*Ejercicio 2
    Crea una función que dado un conjunto de enteros devuelva si existe un número dentro de él

    Ejemplo:
    [1,2,3,4,5,6] existe 3 -> true*/

    do {
        menu2()
        println("Selecciona")
        val opcion = readln().toIntOrNull()


        var conjunto = mutableListOf(1, 2, 3, 4, 5)
        println("Escribe un número")
        val numero = readln().toIntOrNull()

        if (numero != null) {
            println(isEsxiste(numero, conjunto))
        } else {
            println("ERROR: dato no valido")
        }


    } while (opcion != 0)

}//fin main

fun isEsxiste(numero: Int, conjunto: MutableList<Int>): Boolean {
    val existe = numero in conjunto
    return existe
}

fun menu2() {
    println("Jugar [1]")
    println("Terminar [0]")
}