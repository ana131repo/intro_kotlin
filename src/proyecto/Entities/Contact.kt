package proyecto.Entities

class Contact(
    var name: String,
    var lastName: String,
    var phoneNumber: String,
    var mail: String,
    var nickName: String,
    var isFavorite: Boolean

) {
    val id: Int = incrementAndGetLasId()

    companion object{
        private var lastId: Int =0

        fun incrementAndGetLasId(): Int{
            return lastId++
        }
    }
}