package arrays

fun main() {
    /*Ejercicio 3
    Crea una función que dado un conjunto de enteros devuelva el número de veces que se repite un número dado

            Ejemplo:
    [1,2,3,4,5,6] número 3 -> 1*/

    val conjunto = listOf(1, 2, 3, 4, 5, 6)
    do {
        menu()
        println("Selecciona una opción")
        val opcion = readln().toIntOrNull()
        if (opcion != null) {
            when (opcion) {
                1 -> {
                    println("Escribe un número")
                    val usuario = readln().toIntOrNull()
                    if (usuario != null) {
                        repeticiones(conjunto, usuario)
                    } else {
                        println("Entrada invalida")
                    }
                }

                0 -> {
                    println("Cerrando programa")

                }
            }
        } else {
            println("Dato inválido")
        }

    } while (opcion != 0)

}

private fun menu() {
    println("Jugar[1]")
    println("Salir[0]")
}

fun repeticiones(conjunto: List<Int>, numero: Int) {
    var contador: Int = 0
    for (i in conjunto) {
        if (i == numero) {
            contador++
        }
    }
    println("El $numero se repite $contador")


}