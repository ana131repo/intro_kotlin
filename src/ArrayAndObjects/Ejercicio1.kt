package ArrayAndObjects

fun main() {
    /* Ejercicio 1
     Crea las clases necesarias para definir clases y alumnos y añade. Crea 1 array con 2 clases con 10 alumnos cada una con valores de ejemplo*/


    var alumnosDeClase: MutableList<Alumno> = arrayListOf()
    var contador_clase: Int = 1
    var contador_Alumnos: Int = 1

    //instancio la clase para inicializarla //crear el objeto miClase
    val miClase = Clase(contador_clase, alumnosDeClase)

    do {
        println("Nombre del alumno")
        val nombre_Alumno = readln()
        println("Edad del alumno")
        val edad_alumno = readln().toInt()
        println("Nota")
        val nota_alumno = readln().toFloat()
        miClase.alumnosDeClase.add(Alumno(contador_Alumnos, nombre_Alumno, edad_alumno,nota_alumno))
        contador_Alumnos++
        Clase(contador_clase, alumnosDeClase)

    } while (contador_Alumnos < 3)

    /*ejercicio2
     Imprime por consola todos los alumnos cuyo nombre contiene "a" en cada una de las clases*/


    println("Los alumnos de clase que contienen la letra 'a' son:")
    for (a in alumnosDeClase) {
        if (a.name.contains("a", ignoreCase = true)) {
            println(a.name)
        }
    }

    /*Ejercicio 3
   Añade un atributo nuevo a la clase que sea isApproved y otra que sea isProgressing e imprime todos los
    alumnos suspendidos que no esten progresando de cada clase

    */

    for(a in alumnosDeClase){
       if(alumnosAndNotas(a)==true){
           println("${a.name} está aprobado")
       }else{
           println("${a.name} está progresando")
       }
    }


}//fin main

class Alumno(
    val id: Int,
    val name: String,
    var edad: Int,
    var nota: Float

) {
    override fun toString(): String {
        return "Alumno(id='$id',nombre='$name',edad='$edad')"
    }

}

class Clase(
    val id: Int,
    var alumnosDeClase: MutableList<Alumno>

) {


    override fun toString(): String {
        return "Clase(id='$id',alumnos='$alumnosDeClase')"
    }
    companion object{
        val isApproved:Boolean = true
         val isProgressing:Boolean=false


    }




}
fun alumnosAndNotas(alumno: Alumno):Boolean{
   if(alumno.nota>5 ){
       return Clase.isApproved
   }else{
       return Clase.isProgressing
   }

}










