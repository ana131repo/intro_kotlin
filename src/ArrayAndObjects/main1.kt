package ArrayAndObjects

//definir clases
class ClassRoom(
    val id: Int,
    val name: String,
    var students: ArrayList<Student>
):classInterface {
    override fun addStudent(student: Student) {
        students.add(student)

    }

    override fun toString(): String {
        return "ClassRoom(id=$id, name='$name', students=$students)"
    }


}

class Student(
    val id: Int,
    val name: String,
    var age: Int
) :StudentInterface{
    override fun write() {

    }

    override fun failExam() {

    }

    override fun read() {

    }

    override fun passExamen() {

    }

    override fun cry() {

    }

    override fun toString(): String {
        return "Student(id=$id, name='$name', age=$age)"
    }


}




fun main() {
    val studentsA: ArrayList<Student> = arrayListOf()
    val studentsB: ArrayList<Student> = arrayListOf()
    studentsA.add(Student(1,"ana",40),)
    studentsA.add(Student(2,"Felipe",43),)
    studentsA.add(Student(3,"Miguel",23),)
    studentsB.add(Student(1,"Lucia",34),)
    studentsB.add(Student(2,"Ernesto",43),)
    studentsB.add(Student(3,"Miguel",23),)
    val classRoomA = ClassRoom(1,"Jueves",studentsA)
    val classRoomB = ClassRoom(2,"Viernes",studentsB)
    println(classRoomA)
    println(classRoomB)
}