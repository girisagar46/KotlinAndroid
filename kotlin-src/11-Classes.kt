class Car constructor(make: String, model: String) {
    val make = make
    val model = model
}

// Also same thing as previous
class Car2(make: String, model: String) {
    val make = make
    val model = model
}

// Also same thing as previous
class Car3(val make: String, val model: String) {
    fun accelerate() {
        println("vroom vroom")
    }
}

class Empty // Empty class


//fun main(args: Array<String>) {
//    val c1 = CarClass("Toyota", "Avalon")
//    val c2 = Car("Tesla", "Tesla Roadster")
//
//    println(c1.make)
//    println(c2.model)
//
//    val c3 = Car3("Hello", "World")
//    c3.accelerate()
//
//    val truck = Truck("Mater", "Truck", 500)
//    truck.tow()
//    truck.details()
//
//}