package arrays

fun main() {

    /* Ejercicio 6
     Crea una función que dado un conjunto de Int devuelva el primer número entre 1 y 1000000 que no se encuentre dentro del array

             Ejemplo:
     [1,4,3,5,2] devuelve 6
     [1,6,3,5,2] devuelve 4*/

    val conjunto = listOf(1, 2, 3, 4, 7, 8, 9)
    do {
        menu6()
        println("Selecciona una opción")
        val opcion = readln().toIntOrNull()
        if (opcion != null) {
            when (opcion) {
                1 -> {
                    println("Escribe un número entre 1 y 1000000")
                    val numero = readln().toIntOrNull()
                    if(numero!=null){
                        buscar(conjunto,numero)

                    }else{
                        println("Dato inválido")
                    }

                }
                0->{
                    println("Cerrando programa")
                    break
                }
            }


        } else {
            println("Introduce la opción correcta")
        }


    } while (opcion != 0)


}

fun menu6() {
    println("Jugar [1]")
    println("Jugar [0]")

}
fun buscar(array:List<Int>,numero:Int) {
    var isEncontrado: Boolean

    for (n in array) {
        if (n == numero) {
            println("El $numero es encontrado")
        }
    }
}
