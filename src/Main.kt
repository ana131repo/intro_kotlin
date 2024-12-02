//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //1.tipos de datos
    //Enteros
    val integer: Int =29
    val long: Long = 10000000000L

    //Flotante
    val flotante: Float = 3.14f
    val double: Double = 3.1414598977

    //Booleanos

    var isFavorite: Boolean = true
    isFavorite =  false

    //Caracteres (Char)
    val Characterr: Char = 'k'

    //Cadenas (los famosos Strings)
    val regards: String ="Hola mundo"

    //Imprimir por terminal

    println("Entero: " + integer)
    println("isFavorite " + isFavorite)
    println("Regards " + regards)

    //2-bucles
    //For y sus derivados, while, DoWhile

    for(i in 0..5){
        println("Value for i: " + i)
    }
    //de dos en dos
    for(i in 0..5 step 2){
        println("Value for i: " + i)
    }
    var valueA =3
    var valueB = 5
    while (valueA> valueB){
       // valueA++ //una manera de incrementar
        valueA.inc()
      //  valueA = valueA+1 //una manera de incrementar
       // valueA+=1
        println("Hola soy pepe")
    }
    do{
        valueA++

    }while(valueA<valueB)

    //3 -When (cases) <-Switch

    val day = 5

    when (day){
        1 -> println("Hoy es lunes")
        2 -> println("Hoy es martes")
        3 -> println("Hoy es miercoles")
        4-> println("Hoy es jueves")
        5 -> println("Hoy es viernes")
        6 -> println("Hoy es sabado")
        7 -> println("Hoy es Domingo")
        else -> {
            println("No has ingresado un día valido")
        }



    }
    /*
Condicionales

== Comparar si dado dos argumentos son iguales. true/false
!= Comparar si dado los argumentos son distintos true/false
&& Compara si dados dos condiciones, que ambas se cumplan. true/false
|| Compara si dadas dos o más condiciones, al menos 1 de cumpla. true/false
< . true/false
> . true/false
<= .....
>= .....
*/



    // Condicionales
   valueA = 2
   valueB = 7
    if (valueA > valueB) {
// Si se cumple, procede a la lógica
        if(valueB == 3) {
//Haz esto...
        } else {
//Sino aquello...
        }
    } else {
//Sino se cumple el argumento...
// Procede aqui.
    }





}