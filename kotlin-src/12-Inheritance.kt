//class CarClass constructor(make: String, model: String) {
//    val make = make
//    val model = model
//}
//
//
//class Truck(val make: String, val model: String, val towingCapacity: Int) {
//    fun tow() {
//        println("Towing the car")
//    }
//
//    fun details() {
//        println("This is $make $model with capacity of $towingCapacity ton")
//    }
//}


/**
 * In kotlin, all classes and it's methods are closed.
 * Which means it can't be inherited or overridden.
 * So inorder to make a class/methods that can be inherited or overridden,
 * we should define open class or methods with open keyword
 */

open class Vehicle(val make: String, val model: String) {
    open fun accelerate() {
        println("Vroom Vroom")
    }

    fun park() {
        println("Parking the vehicle")
    }

    fun brake() {
        println("STOP")
    }
}

class MyCar(make: String, model: String, val color: String) : Vehicle(make, model) {
    override fun accelerate(){
        println("Stealth Mode")
    }
}

class Truck(make: String, model: String, val towingCapacity: Int) : Vehicle(make, model) {

    // Truck class's own method
    fun tow(){
        println("Towing with a truck")
    }
}


fun main(args: Array<String>) {
    val tesla = MyCar("Tesla", "ModelS", "Black")
    println("Car Color: ${tesla.color}")
    tesla.accelerate()
    tesla.brake()

    val truck = Truck("Ford", "Ford-123", 120)
    truck.brake()
    truck.accelerate()
    truck.tow()
    println("Truck Towing Capacity: ${truck.towingCapacity} ton")
}