package arrays

fun main() {

    /*Ejercicio 5
    Crea una función que dado un conjunto de String añada un nuevo elemento que se le pase y devuelva el nuevo array

            Ejemplo:
    ["aa","bb","cc","dd"] "ee"-> ["aa","bb","cc","dd","ee"]*/

    //crear una lista mutable
    var conjunto = mutableListOf("aa", "bb", "cc", "dd")

    do {
        menu5()
        println("Escoge una opción")
        val opcion = readln().toIntOrNull() //recoger dato del usuario
        if (opcion != null) {
            when (opcion) {
                1 -> {
                    println(conjunto.toString()) //mostrar el conjunto sin añadir aun nada
                    println("Escribe un nuevo valor para añadir")
                    val newValor = readlnOrNull() ?: "" //recoger dato si es null que entonces sea un dato vacio
                    if (newValor.isNotEmpty()) {  //nuevo dato no es vacio
                        anadir(conjunto, newValor)
                        println("El nuevo listado es:")
                        println(conjunto.toString())
                    } else {
                        println("Dato Invalido")
                    }
                }

                0 -> {
                    println("Cerrando programa")
                    break
                }
            }

        } else {
            println("Datos inválidos")
        }


    } while (opcion != 0)


}

fun menu5() {
    println("Jugar [1]")
    println("Salir [0]")
}

fun anadir(array: MutableList<String>, nValor: String): MutableList<String> {

    array.add(nValor)
    return array

}