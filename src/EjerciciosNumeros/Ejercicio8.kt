package EjerciciosNumeros

fun main() {
    /*Ejercicio 8
Crea una función para calcular los X primeros números primos

Ejemplo:
los 5 primeros: 1, 2, 3, 5, 7
     */
    var contador: Int = 0
    var isPrimo: Boolean = true

    do {
        for (numero in 2..100) {
            isPrimo = true
            for (divisor in 2..numero - 1) {
                if (numero % divisor == 0) {
                    isPrimo = false
                    break
                }
            }
            if (isPrimo) {
                contador++
                println("$contador primo $numero")
            }


        }

    } while (contador < 20)


}