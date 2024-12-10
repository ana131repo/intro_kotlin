package proyecto.Entities
/*Crear una aplicacion que permita al usuario crear, modificar, eliminar y listar contactos
SIN PERSISTENCIA
* */

fun main() {
    var agenda = Agenda(arrayListOf())
    var isOn = true
    var optionMenu: Int = -1

    showRegards()

    do {
        showMenu()
        optionMenu = getUserSelection()
        funEvaluateOptionAndContacts(agenda.contacts,optionMenu)


    } while (isOn)

}

fun funEvaluateOptionAndContacts(contact: ArrayList<Contact>,option: Int,) {
    when (option) {
        1 -> {
            println("Crear contacto")
            val newContacto = createContact()
        }
        2 -> {
            println("Modificar contacto")
        }
        3 -> {
            println("Eliminar contacto")
        }
        4 -> {
            println("Listar contacto")
        }
        5 -> {
            println("Cerrando programa")
        }

        else -> {
            println("Dato no válido")
        }
    }




}

fun showRegards() {
    println("Bienvenido a tu agenda personal")
    println("****---------------------------")
}

fun showMenu() {
    println("Elige una opción")
    println("1- Crear contacto")
    println("2- Modificar contacto")
    println("3- Eliminar contacto")
    println("4- Listar contacto")
}

fun getUserSelection(): Int {
    val option = readlnOrNull()?.toIntOrNull()
    return if (option is Int) {
        option
    } else {
        6
    }

}
fun createContact(){


}
fun readContacts(){


}
fun deleteContact(){

}
fun updateContact(){

}


