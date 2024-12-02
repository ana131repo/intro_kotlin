package EjerciciosNumeros

fun main() {
    /*Ejercicio 8
Crea una función para calcular los X primeros números primos

Ejemplo:
los 5 primeros: 1, 2, 3, 5, 7
     */

    var isPrimo: Boolean = true


    for (numero in 3..100) {
        isPrimo = true
        for (divisor in 2..numero)
            if (numero % divisor-1 == 0) {
                println(numero)
                println("El divisor $divisor")
                isPrimo = false
                break

            }
        if (isPrimo) {
            println("Este es supuesto primo $numero")
        }
    }



}