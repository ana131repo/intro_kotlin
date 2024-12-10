package arrays

<<<<<<< HEAD
fun main() {
    /* Crea una función que dado un conjunto de enteros los ordene de mayor a menor y devuelva el array resultante. NO SE PUEDE USAR SORT

             Ejemplo:
     [6,2,3,4,5,1] -> [1,2,3,4,5,6]*/

    val conjunto = mutableListOf(6, 5, 4, 3, 2, 1)

    do {
        menu4()
        println("Escoge una opcion")
=======

fun main() {/*Ejercicio 4
    Crea una función que dado un conjunto de enteros los ordene de mayor a menor y devuelva el array resultante. NO SE PUEDE USAR SORT

            Ejemplo:
    [6,2,3,4,5,1] -> [1,2,3,4,5,6]*/
    val conjunto = intArrayOf(7,6, 5, 4, 3, 2, 1)


    do {
        menu()
        println("Selecciona")
>>>>>>> Exercise4_Arrays
        val opcion = readln().toIntOrNull()
        if (opcion != null) {
            when (opcion) {
                1 -> {
<<<<<<< HEAD
                    var ordenado = ordenar(conjunto)
                    println(conjunto.toString())
=======
                    println("Ordenar array")
                    ordenado(conjunto)

>>>>>>> Exercise4_Arrays

                }

                0 -> {
                    println("Cerrando programa")
                    break
                }
<<<<<<< HEAD

            }
        } else {
            println("Datos inválidos")
=======
            }
        } else {
            println("Error: dato inválido")
>>>>>>> Exercise4_Arrays
        }


    } while (opcion != 0)

<<<<<<< HEAD

}

fun menu4() {
=======
}//fin main
private fun menu() {
>>>>>>> Exercise4_Arrays
    println("Jugar[1]")
    println("Salir[0]")
}

<<<<<<< HEAD

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
=======
fun ordenado(array: IntArray) {
    var contador = array.size

    for (i in array.indices-1) {

        for (j in 0..(contador - i) - 2) {
            if (array[j] < array[j + 1]) {
                val aux = array[j]
                array[i] = array[j + 1]
                array[j+1] = aux
            }
        }
    }
    for (i in array){
        println(" numero $i")
    }

>>>>>>> Exercise4_Arrays
}



<<<<<<< HEAD


=======
>>>>>>> Exercise4_Arrays
