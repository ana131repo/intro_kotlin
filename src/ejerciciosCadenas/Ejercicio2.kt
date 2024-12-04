package ejerciciosCadenas

fun main(){
    /*Ejercicio 2
    Crea una función que dada una frase sustituyeya un carácter por otro

            Ejemplo:
    "esta frase es de ejemplo" letra a buscar "a" letra a sustituir "i" -> "esti frise es de ejemplo"*/


    println("Escribe una texto")
    val texto = readln()

    println("Escribe el caracter que quieres sustituir")
    val sustituir = readln()

    println("Escribe el caracter que quieres insertar")
    val insertar = readln()
    reemplazar(texto,sustituir,insertar)

}

fun reemplazar(texto:String,sustituir:String,insertar:String){
    val nuevoTexto = texto.replace(sustituir,insertar)
    println(nuevoTexto)
}