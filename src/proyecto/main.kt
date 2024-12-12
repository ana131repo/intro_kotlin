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
        funEvaluateOptionAndContacts(agenda.contacts, optionMenu)


    } while (isOn)

}

fun funEvaluateOptionAndContacts(contact: ArrayList<Contact>, option: Int) {
    when (option) {
        1 -> {
            println("Crear contacto")
            val newContacto = createContact()
        }

        2 -> {
            println("Leer contacto")
            readAndShoWContacts(contact)

        }

        3 -> {
            println("Modificar contacto")
        }

        4 -> {
            println("Eliminar contacto")
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
    println("2- Leer contacto")
    println("3- Modificar contacto")
    println("4- Eliminar contacto")
    println("5 - Salir agenda")
}

fun getUserSelection(): Int {
    val option = readlnOrNull()?.toIntOrNull()
    return if (option is Int) {
        option
    } else {
        6
    }

}

fun createContact() {


}

fun readAndShoWContacts(contacts: ArrayList<Contact>) {
  /*  // al leer contact lo paso a contacs y apartir del segundo contacts -> ahi es cuando lee
    //contactos haz esto contacts.lt
    contacts.let { contacts ->
        contacts.forEachIndexed { index, contact ->
            if (contact.name.isNotEmpty()) {
                println("${index + 1} ${contact.nickName}")
            } else {
                println("${index + 1}${contact.name} ${contact.lastName}")
            }
        }
    }.run {
        if (contacts.isEmpty()) {
            println("forma mas kotlin //no hay contactos")
        }
    }

    // mas java
    if (contacts.isNotEmpty()) {
        println("Contactos")
        contacts.forEachIndexed() { index, contact ->
            if (contact.nickName.isNotEmpty()) {
                println("${index + 1}${contact.nickName}")
            } else {
                println("${index + 1}${contact.name} ${contact.lastName}")
            }

        }
    } else {
        println("for mas java //No hay contactos")

    }
*/





//    }.run {  //else en el caso de .let, aunque siempre llega aqui, no es completamente un else, ejecuta esto siempre
//        if (contacts.isEmpty()) {
//            println("No hay contactos")
//        }

    //forma yeffy

    if(contacts.isEmpty()){
        println("no hay contactos")
    }else{
        contacts.forEachIndexed{index,contact ->
           //falta una funcion// la imagen de whaspta

            if (contact.nickName.isNotEmpty()) {
                println("${index + 1}${contact.nickName}")
            } else {
                println("${index + 1}.${contact.name} ${contact.lastName}")
            }
        }

    }


}
fun deleteContact() {

}

fun updateContact() {

}


