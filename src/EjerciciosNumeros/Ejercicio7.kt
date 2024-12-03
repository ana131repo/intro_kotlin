package EjerciciosNumeros

fun main(){
    /*Ejercicio 7
Calcula el volumen de una piscina dado el ancho, largo y la altura
Ejemplo:
ancho 4 largo 4 alto 3 -> 48
    */
    println("Calcular el volumen de una pìscina")
    println("Escribe el ancho")
    val ancho = readln().toFloatOrNull()
    println("Escribe el largo")
    val largo = readln().toFloatOrNull()
    println("Escribe la altura")
    val alto = readln().toFloatOrNull()

    if(ancho!=null && largo!=null && alto!=null){
        volumen_piscina(ancho,largo,alto)
    }
}
fun volumen_piscina(ancho:Float,largo:Float,alto:Float){
    val resultado = ancho*largo*alto
    println("Volumen piscina = $resultado ($ancho * $largo * $alto")
}