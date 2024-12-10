package arrays

fun main() {
    /* Crea una función que dado un conjunto de enteros los ordene de mayor a menor y devuelva el array resultante. NO SE PUEDE USAR SORT

             Ejemplo:
     [6,2,3,4,5,1] -> [1,2,3,4,5,6]*/

    val conjunto = mutableListOf(6, 5, 4, 3, 2, 1)

    do {
        menu4()
        println("Escoge una opcion")
        val opcion = readln().toIntOrNull()
        if (opcion != null) {
            when (opcion) {
                1 -> {
                    var ordenado = ordenar(conjunto)
                    println(conjunto.toString())

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

fun menu4() {
    println("Jugar[1]")
    println("Salir[0]")
}


fun ordenar(array: MutableList<Int>) {
    val n = array.size
    for (i in 0 until n - 1) {
        for (j in 0 until n - i - 1) {
            if (array[j] > array[j + 1]) {
                // Intercambia elementos
                val temp = array[j]
                array[j] = array[j + 1]
                array[j + 1] = temp
            }
        }
    }
}





