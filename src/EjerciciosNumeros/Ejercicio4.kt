package EjerciciosNumeros

fun main(){
    /*Ejercicio 4
Crea una función que dado 2 números enteros los divida y devuelva la parte entera de la división. Si el divisor es 0 devuelve nulo
Ejemplo:
5/2 -> 2
     */

    print("Dime número 1")
    val dividendo = readln().toFloatOrNull()
    print("Dime número 2")
    val divisor = readln().toFloatOrNull()
    if(dividendo !=null && divisor !=null){
        division(dividendo,divisor)
    }else{
        println("Error: Los números que ingresaste son inválidos")
    }


}
fun division(dividendo: Float,divisor:Float){
    var dividir = dividendo/divisor
    println("La multiplicación de dos flotantes $dividendo / $divisor = $dividir")
}