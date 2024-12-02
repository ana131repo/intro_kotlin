package EjerciciosNumeros

fun main(){
    /*Ejercicio 6
Crea una función que dados 2 números devuelva el de mayor valor
Ejemplo:
4 y 7 -> 7
    */
    val num1=4
    val num2=7

    val resultado = if (num1>num2){
        num1

    }else{
        num2
    }

    println("El número mayor es $resultado")
}
