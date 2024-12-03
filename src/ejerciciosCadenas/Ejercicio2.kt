package ejerciciosCadenas

fun main(){
    /*Ejercicio 2
    Crea una función que dada una frase sustituyeya un carácter por otro

            Ejemplo:
    "esta frase es de ejemplo" letra a buscar "a" letra a sustituir "i" -> "esti frise es de ejemplo"*/


    println("Escribe una texto")
    var texto = readln()

    println("Escribe el caracter que quieres sustituir")
    var sustituir = readln()

    println("Escribe el caracter que quieres insertar")
    var insertar = readln()
    reemplazar(texto,sustituir,insertar)

}

fun reemplazar(texto:String,sustituir:String,insertar:String){
    val nuevotexto = texto.replace(sustituir,insertar)
    println(nuevotexto)
}