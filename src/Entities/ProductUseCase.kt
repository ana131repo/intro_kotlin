package Entities

interface ProductUseCase {
    fun isProductAvailable(id:Int):Boolean
}