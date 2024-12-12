package ArrayAndObjects

import proyecto.Entities.Contact

fun main() {

    //mirar collections.kt

    //list //no son mutables

    val MyList: List<Int>
    MyList = listOf(1, 2, 3, 4, 5, 6)  //inicializar una lista
    // MyList = listOf(1, 2, 3, 4, 5, 6).toMutableList()  // pasarlo a mutable

    val myNewLista = arrayListOf(MyList)  //convertir una lista en un array


    //ArrayList

    val myArrrayList: ArrayList<Contact>
    myArrrayList = arrayListOf(
        Contact(
            name = "Pepe",
            lastName = "ddddd",
            phoneNumber = "44444444",
            mail = "33333",
            nickName = "hhhhh",
            isFavorite = true
        )
    )
    myArrrayList.removeAt(0) // esto no lo guardaria en memoria porque es un array

    myArrrayList.toList()  //pasarlo a lista
    myArrrayList.toMutableList() //pasarlo a mutable


    //MutableList  //es mas novedad //es mas flexible
    val myMutableList: MutableList<String>
    myMutableList = mutableListOf("", "lata")
    myMutableList.add("loquesea")

    myMutableList[0]
    //lo mismo que my arraylist myArraylist.remove o add o ....

    myMutableList.toList()  //pasarlo a lista
    myMutableList.add("lll") // aunque sea una constante sigue siendo mutable


    //Arrays
    val myArray = arrayOf(2.0f, 4.5f) //crear un array
    val arrayInts = intArrayOf(2, 3, 4, 5, 6, 6) //crear un array de enteros
    val arrayChar = charArrayOf('a', 'b')
    val arrayOthers = doubleArrayOf()
    val array = Array(5) { 0 } //5 tamaños y empieza en 0 o un vacio //nulos no permitidos
    // tb puede ser String{""}


    //Maps  //clave-Valor  //no es mutable  //es mas kotlin
    //mapOf() es inmutable
    val myMap = mapOf(
        "a" to 1,
        "b" to 2,
        "c" to 3,
        "f" to 4,
    )

    //(/// .let no devuelve nulos//es para evitar nulos

    var mapfound: Int = 0
    //var resultado: Int = 0

    myMap.takeIf { it.containsKey("f") }?.let { result ->
        result["f"]?.let { indexContent ->
            mapfound = indexContent
        }
    }






    if (myMap.containsKey("d")) {
        //aqui vendría algo
    }


    myMap.keys
    myMap.containsKey("a")

    val myMutableMap = myMap.toMutableMap()  //transformar a un mutable
    myMutableMap.remove("a")
    myMutableMap["a"]
    myMutableMap.put("Banco",123)
    myMutableMap.clear()


    //hasMap  //es una mas esplícito de clave, valor  //es como un diccionario  //es mas de java

    val hashmap = HashMap<String,Int>()
    hashmap.put("a",1)  //para llenar





}