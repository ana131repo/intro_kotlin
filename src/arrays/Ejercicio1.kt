package arrays

fun main() {/*Ejercicio 1
    Crea una función que dado un array de números inserte un número en una posición designada. Devuelve el nuevo array o nil en caso de que no sea posible

            Ejemplo:
    [1,2,3,4,5,6] inserta 4 en la posición 2 -> [1,2,4,3,4,5,6]*/

    //val numeros = intArrayOf(1, 2, 3, 4, 5, 6)
    val numerosBien = mutableListOf(1, 2, 3, 4, 5, 6)

    println("Escribe un número ")
    val numero = readln().toInt()
    println("Escribe una posición")
    val posicion = readln().toInt()

    //array1(numero, posicion, numeros)

    arrayBien(numero,posicion,numerosBien)

}

//fun array1(numero: Int, posicion: Int, numeros: IntArray) {
//    println(numeros.size)   //tamaño del array numeros
//    val nuevoArray = IntArray(numeros.size + 1)
//    println(nuevoArray.size)
//    System.arraycopy(numeros, 0, nuevoArray, 0, numeros.size)
//    nuevoArray[posicion] = numero
//
//    for (i in 0..nuevoArray.size) {
//        println(nuevoArray[i])
//    }
//
//}

fun arrayBien(numero: Int, posicion: Int, numerosBien: MutableList<Int>) {
    numerosBien.add(posicion, numero)
    for (numeros in numerosBien)
        print("$numeros ")


    

}