package EjerciciosNumeros

fun main() {
    /*Ejercicio 2
Crea una función que dado 2 números enteros los multiplique y devuelva el resultado
Ejemplo:2*2 -> 4
*/


    print("Dime número 1")
    val num1 = readln().toIntOrNull()

    print("Dime número 2")
    val num2 = readln().toIntOrNull()

    if (num1 != null && num2 != null) {
        multiplicar(num1, num2)
    } else {
        println("Error: Los números que ingresaste son invalidos")
    }


}

fun multiplicar(num1: Int, num2: Int) {

    var multiplicar = num1 * num2
    println("La multiplicación de dos números enteros $num1 x $num2 = $multiplicar")

}