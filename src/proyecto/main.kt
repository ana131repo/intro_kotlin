package proyecto.Entities
/*Crear una aplicacion que permita al usuario crear, modificar, eliminar y listar contactos
SIN PERSISTENCIA
*
 * 0. Crear Agenda
    * 1. Crear clase Contacto
    * 2. Crear Menu informativo
    *       a. Saludos
    *       b. Menu (Visualizar sus opciones)
    * 3. Enseñar al usuario saludos
    * 4. Si hay contactos, enseñar
    * 5. Enseñar menu.
    * 6. Pedir opcion al usuario respecto al menu
    * 7. Evaluamos la respuesta del usuario
    * 8. En funcion de la respuesta lo llevamos a un lado o a otro.

*/

fun main() {
    var agenda = Agenda(arrayListOf())
    var isOn = true
    var optionMenu: Int = -1

    agenda.contacts.addAll(getMockedContacs())

    showRegards()
    readAndShoWContacts(agenda.contacts)

    do {
        showMenu()
        optionMenu = getUserSelection()
        isOn = EvaluateOptionAndContacts(optionMenu, agenda.contacts)

    } while (isOn)

}

fun EvaluateOptionAndContacts(option: Int, contacts: ArrayList<Contact>): Boolean {
    return when (option) {
        1 -> {
            //create
            val newContact = createContact()
            if (newContact.phoneNumber.isEmpty() || newContact.mail.isEmpty()) {
                println("Datos incompletos, no es posible guardar el nuevo contacto")
            } else {
                println(newContact.toString())
                contacts.add(newContact)
                println("Se ha guardado el contacto ${newContact.name} correctamente")
            }
            true
        }

        2 -> {
            //read
            readAndShoWContacts(contacts)
            true

        }

        3 -> {
            //modificar
            var isUpdated = false
            println("Ingresa el Id del contacto a actualizar")
            val contactId = getUserSelection()
            if (contactId > 0) {
                val contact = contacts.filter { it.id == contactId }
                isUpdated = updateContactFromContacsById(contacts, contactId)
                if (isUpdated) {
                    println("Contacto ${contact[0].name} actualizado correctamente")
                } else {
                    println("Lo siento, el contacto con id $contactId no se ha encontrado")
                }
            }
            true
        }

        4 -> {
            //delete
            var isDeleted = false
            println("Ingresa el ID del contacto a borrar")
            val contactId = getUserSelection()
            if (contactId > 0) {
                val contact = contacts.filter { it.id == contactId }
                isDeleted = deleteContactFromContactsById(contacts, contactId)
                if (isDeleted) {
                    println("Contacto  eliminado correctamente")
                } else {
                    println("El contacto que dices no existe")
                }
            }
            true
        }

        5 -> {
            //fin
            println("Cerrando la agenda personal")
            false
        }

        else -> {
            println("Dato inválido")
            //dato invalido
            true
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
        -1
    }

}

fun createContact(): Contact {

    println("Nuevo Contacto")
    println("Ingresar Nombre:")
    val name = readlnOrNull() ?: ""
    println("Ingresar Apellidos:")
    val lastname = readlnOrNull() ?: ""
    println("Ingresar Nickname:")
    val nickname = readlnOrNull() ?: ""
    println("Ingresar número telefónico:")
    val phone = askForPhoneNumber()
    val mail = askForMail()
    val isFavourite = askForIsFavourite()

    return Contact(
        name = name,
        lastName = lastname,
        phoneNumber = phone.toString(),
        nickName = nickname,
        mail = mail,
        isFavorite = isFavourite
    )


}

fun updateMail(lastEmail: String): String {
    println("Ingresar Email")
    var email = readlnOrNull() ?: ""

    if (getAtTotalAmount(email) == 1) {
        val pieces = email.split("@")
        val hasDotOnSecondPart = pieces[1].contains(".")
        if (hasDotOnSecondPart) {
            email = lastEmail
        }

    } else {
        email = lastEmail
    }

    return email
}

fun getAtTotalAmount(email: String): Int {
    var counter = 0
    email.forEach {
        if (it == '@') {
            counter++
        }
    }
    return counter
}

fun askForMail(): String {
    var email = ""
    while (email.isEmpty()) {
        println("Ingresar Email")
        email = readlnOrNull() ?: ""


        if (getAtTotalAmount(email) == 1) {
            val pieces = email.split("@")
            val hasDotOnSecondPart = pieces[1].contains(".")
            if (hasDotOnSecondPart) {
                email = " "
            }

        } else {
            email = ""
        }

        if (email.isEmpty()) {
            println("El correo no cumple con los requerimiento mínimos")
        }

    }
    return email
}


fun askForPhoneNumber(): Int {
    var phoneNumber: Int = 0
    while (phoneNumber == 0) {
        println("Ingresa el número de tu nuevo contacto")
        phoneNumber = getValidPhoneNunber(readlnOrNull())
    }
    return phoneNumber
}

fun getValidPhoneNunber(phone: String?): Int {
    //2-minimo 3 digitos
    //1-Solo número
    var newNumber = phone ?: ""
    var parsedNumber = 0

    if (newNumber.isEmpty()) {
        return 0
    } else {
        newNumber = newNumber.filter { !it.equals(" ") }
        if (newNumber.length > 2) {
            parsedNumber = newNumber.toIntOrNull() ?: 0
            return parsedNumber
        } else {
            return 0
        }
    }

}

private fun askForIsFavourite(): Boolean {
    var isFavourite: Boolean? = null
    while (isFavourite == null) {
        println("Ingresa true si es favorito, false si no lo es.")
        isFavourite = Contact.isFavoriteValueValid(readlnOrNull())

        if (isFavourite == null) {
            println("Error; has  introducido un valor inválido")
        }
    }
    return isFavourite
}

fun getContactInfo(index: Int, contact: Contact): String {
    return if (contact.nickName.isEmpty()) "${index}. ID:${contact.id} Name:${contact.name} ${contact.lastName}"
    else "${index}. ID:${contact.id} Name:${contact.nickName}"
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
    println("-------------------")
    println("Contactos:")

    if (contacts.isEmpty()) {
        println("no hay contactos")
    } else {
        contacts.forEachIndexed { index, contact ->
            val position = index + 1
            println(contact.toString())
        }
    }
}

fun deleteContactFromContactsById(contacts: ArrayList<Contact>, id: Int): Boolean {
    val filteredContacts = contacts.filter { it.id == id }
    return if (filteredContacts.isEmpty()) {
        false
    } else {
        contacts.remove(filteredContacts[0])
    }
}


fun updateContactFromContacsById(contacts: ArrayList<Contact>, contactId: Int): Boolean {
    val filteredContacts = contacts.filter { it.id == contactId }
    return if (filteredContacts.isEmpty()) {
        false
    } else {
        val outDatecontact = filteredContacts[0]
        val updateContact = updateContactValues(outDatecontact)
        return if (updateContact.phoneNumber.isEmpty() || updateContact.mail.isEmpty()) {
            false
        } else {
            contacts.remove(outDatecontact)
            contacts.add(updateContact)//new contact
            true
        }
    }
}

fun updateContactValues(contact: Contact): Contact {
    println("---------------------------")
    println(contact.toString())
    println("---------UPDATE ----------")
    println("Nuevo Contacto")
    println("Ingresar Nombre:")
    val name = readlnOrNull() ?: contact.name
    println("Ingresar Apellidos:")
    val lastname = readlnOrNull() ?: contact.lastName
    println("Ingresar Nickname:")
    val nickname = readlnOrNull() ?: contact.nickName
    println("Ingresar número telefónico:")
    val phone = askForPhoneNumber()
    val mail = updateMail(contact.mail)
    val isFavourite = askForIsFavourite()

    contact.name = name
    contact.lastName = name
    contact.nickName = nickname
    contact.phoneNumber = phone.toString()
    contact.isFavorite = isFavourite
    contact.mail = mail

    return contact

}
//contactos de prueba

fun getMockedContacs(): List<Contact> {
    return listOf(
        Contact(
            name = "Juan",
            lastName = "Pérez",
            phoneNumber = "123456890",
            mail = "juan.perez@example.com",
            nickName = "Juancito",
            isFavorite = true
        ),
        Contact(
            name = "María",
            lastName = "Gómez",
            phoneNumber = "9876543210",
            mail = "maria.gomez@example.com",
            nickName = "Mari",
            isFavorite = false
        ),
        Contact(
            name = "Carlos",
            lastName = "Rodríguez",
            phoneNumber = "4567890123",
            mail = "carlos.rodriguez@example.com",
            nickName = "Carlitos",
            isFavorite = true
        ),
        Contact(
            name = "Ana",
            lastName = "López",
            phoneNumber = "3216549870",
            mail = "ana.lopez@example.com",
            nickName = "Anita",
            isFavorite = false
        )
    )
}



