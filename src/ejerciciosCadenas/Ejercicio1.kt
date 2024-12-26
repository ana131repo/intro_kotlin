package ejerciciosCadenas

fun main(){
    /* Crea una función que dados 2 strings los concatene y los devuelva
     Ejemplo:
     "esta es una cadena" y "otra cadena" -> "esta es una cadenaotra cadena"*/

    println("Escribe un texto")
    var cad1 = readln()
    println("Escribe otro texto")
    var cad2 = readln()
    concatenar(cad1,cad2)

}

fun concatenar(cad1:String,cad2:String){
   val cadenaCompleta = cad1 + cad2
    println(cadenaCompleta)
}
