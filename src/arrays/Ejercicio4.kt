package arrays


fun main() {/*Ejercicio 4
    Crea una función que dado un conjunto de enteros los ordene de mayor a menor y devuelva el array resultante. NO SE PUEDE USAR SORT

            Ejemplo:
    [6,2,3,4,5,1] -> [1,2,3,4,5,6]*/
    val conjunto = intArrayOf(7,6, 5, 4, 3, 2, 1)


    do {
        menu()
        println("Selecciona")
        val opcion = readln().toIntOrNull()
        if (opcion != null) {
            when (opcion) {
                1 -> {
                    println("Ordenar array")
                    ordenado(conjunto)


                }

                0 -> {
                    println("Cerrando programa")
                    break
                }
            }
        } else {
            println("Error: dato inválido")
        }


    } while (opcion != 0)

}//fin main
private fun menu() {
    println("Jugar[1]")
    println("Salir[0]")
}

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

}



