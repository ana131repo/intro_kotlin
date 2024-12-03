package EjerciciosNumeros

fun main(){
    /*Ejercicio 3
Crea una función que dado 2 números enteros (dividendo y divisor) los divida y devuelva el resultado solo si el divisor no es 0 en caso contrario devuelve nulo
Ejemplo:
5/0 -> null
5/2 -> 2,5
*/
    print("Dime número 1")
    val dividendo = readln().toIntOrNull()
    print("Dime número 2")
    val divisor = readln().toIntOrNull()
    if(dividendo != null && divisor != null){
        division(dividendo,divisor)
    }else{
        println("Error: Los números que ingresaste son inválidos")
    }



}
fun division(dividendo:Int,divisor:Int){

    val resultado = dividendo.toFloat()/divisor.toFloat()
    println("La división de dos números enteros $dividendo / $divisor = $resultado")
}