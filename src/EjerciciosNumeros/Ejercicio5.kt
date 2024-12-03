package EjerciciosNumeros

fun main(){
    /* Ejercicio 5
Crea una función que calcule el porcentaje de victorias de un equipo de futbol según los partidos que ha jugado y los que ha ganado

Ejemplo:
jugados 10 partidos ganados 9 -> 90%
     */

    print("Introduce los partidos jugados")
    var jugados = readln().toIntOrNull()
    print("Introduce los partidos ganados")
    var ganados = readln().toIntOrNull()
    if(jugados !=null && ganados !=null){
        porcentaje(jugados,ganados)
    }else{
        println("Error: Los números ingresados no son válidos")   }




}
fun porcentaje(jugados:Int,ganados:Int){
    var porcentaje = (ganados * 100)/jugados
    println("jugados $jugados partidos jugados y  ganados $ganados --> $porcentaje%")
}
