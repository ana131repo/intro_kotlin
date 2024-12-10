package ArrayAndObjects

fun main() {
    /* Ejercicio 1
     Crea las clases necesarias para definir clases y alumnos y añade. Crea 1 array con 2 clases con 10 alumnos cada una con valores de ejemplo*/


    var alumnosDeClase: MutableList<Alumno> = arrayListOf()
    var contador_clase: Int = 1
    var contador_Alumnos: Int = 1

    //instancio la clase para inicializarla //crear el objeto miClase
    val miClase = Clase(contador_clase,alumnosDeClase)

    do {
        println("Nombre del alumno")
        val nombre_Alumno = readln()
        println("Edad del alumno")
        val edad_alumno = readln().toInt()
        miClase.alumnosDeClase.add(Alumno(contador_Alumnos, nombre_Alumno, edad_alumno))
        contador_Alumnos++
        Clase(contador_clase, alumnosDeClase)
    } while (contador_Alumnos < 2)
    println(miClase)
}

class Alumno(
    val id: Int,
    val name: String,
    var edad: Int

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
}





