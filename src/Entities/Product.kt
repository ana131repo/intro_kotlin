package Entities

class Product(
    /** Atributes **/
    val id: Int,
    var name: String,
    var quantity: Float,
    var reference:String,
    var image:String,
    var descripcion:String,
    var price: Float



):ProductUseCase ,ProductInterface{


    fun recalculateTotalAmount(){

}
    companion object {
        var lastIdReceived:Int =0
        fun getnewId() = lastIdReceived++


    }

    override fun isProductAvailable(id: Int): Boolean {
        return if(quantity>0f) true else false

    }

    override fun isProductAvailable2(id: Int): Boolean {

        TODO("Not yet implemented")
    }



}