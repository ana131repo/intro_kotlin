package EjerciciosNumeros

fun main(){
    /* Ejercicio 5
Crea una función que calcule el porcentaje de victorias de un equipo de futbol según los partidos que ha jugado y los que ha ganado

Ejemplo:
jugados 10 partidos ganados 9 -> 90%
     */

    var victorias: Int = 9
    var partidos: Int = 10

    var porcentaje = (victorias * 100)/partidos
    println("jugados $partidos partidos ganados $victorias --> $porcentaje%")

}