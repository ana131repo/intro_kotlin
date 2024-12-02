package EjerciciosNumeros

fun main(){
    /*Ejercicio 4
Crea una función que dado 2 números enteros los divida y devuelva la parte entera de la división. Si el divisor es 0 devuelve nulo
Ejemplo:
5/2 -> 2
     */

    val dividendo:Int= 5
    val divisor: Int = 2

    val resultado = if(divisor == 0){
        null
    }else{
        dividendo/divisor
    }

    println(resultado)


}