package EjerciciosNumeros

fun main(){
    /*Ejercicio 3
Crea una función que dado 2 números enteros (dividendo y divisor) los divida y devuelva el resultado solo si el divisor no es 0 en caso contrario devuelve nulo
Ejemplo:
5/0 -> null
5/2 -> 2,5
*/
    val dividendo:Int = 5
    val divisor:Int = 2


    val resultado = if (divisor == 0) {
        null
    }else{
         dividendo.toFloat()/divisor.toFloat()
    }

    println(resultado)








}