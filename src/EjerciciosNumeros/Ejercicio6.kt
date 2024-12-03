package EjerciciosNumeros

fun main(){
    /*Ejercicio 6
Crea una función que dados 2 números devuelva el de mayor valor
Ejemplo:
4 y 7 -> 7
    */
    println("Escribe el número 1")
    var num1 = readln().toFloatOrNull()
    println("Escribe el número 2")
    var num2 = readln().toFloatOrNull()
    if(num1 !=null && num2!=null){
        comparar(num1,num2)
    }


}
fun comparar(dato1:Float,dato2:Float){
    val resultado = if(dato1>dato2) {
        dato1
    }else{
        dato2
        }
    println("El numero mayor es: $resultado")
    
}
