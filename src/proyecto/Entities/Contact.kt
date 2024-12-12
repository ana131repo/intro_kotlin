package proyecto.Entities

class Contact(
    var name: String,
    var lastName: String,
    var phoneNumber: String,
    var mail: String,
    var nickName: String,
    var isFavorite: Boolean

) {
    val id: Int = incrementAndGetLastId()


    companion object {
        private var lastId: Int = 0

        private fun incrementAndGetLastId(): Int {
            return lastId++
        }

        fun isFavoriteValueValid(isFavorite: String?): Boolean? {
            val value = isFavorite?.trim()?.lowercase() ?: ""
            return when (value) {
                "true", "ok", "1", "y", "si", "sí", "valido", "si es", "dale" -> true
                "false", "ko", "0", "n", "no", "nó", "invalido", "no es", "que no" -> false
                else -> null
            }
        }
    }

    override fun toString(): String {
        return if (nickName.isEmpty()) {
            "Contact(name='$name', lastName='$lastName', phoneNumber='$phoneNumber', mail='$mail', nickName='$nickName', isFavorite=$isFavorite, id=$id)"
        } else {
            "Id:$id, nickName: $nickName, phoneNumber: $phoneNumber, email: $mail, isFavorite: $isFavorite"
        }
    }
}
