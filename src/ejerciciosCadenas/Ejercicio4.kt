package ejerciciosCadenas

fun main(){
    /*Ejercicio 4
    Crea una función que dado un texto devuelva 2 veces las 2 primeras letras. Ejemplo "swift" devuelve "swsw"

    Ejemplo:
    "este es el texto" -> "eses"*/

    println("Escribe una texto")
    var texto = readln()
    duplicar(texto)


}
fun duplicar(texto:String){
    var dosPrimeras = texto.substring(0,2)
    var mostrar = dosPrimeras.repeat(2)
    println(mostrar)

}