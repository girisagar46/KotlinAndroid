fun main(args: Array<String>) {

    /*
    * Kotlin has type inference so that we need not have to mention the type of variable
    * */

    var x = 10
    var name1 = "Sagar"

    var y:Int = 20
    var name2:String = "Sagar" // Here datatype :String is not really required since value is assigned to it
    // name2 = 5 // Can't do this


    val test:String? // This needs datatype because it is an empty variable. val makes it immutable
    test = "Hello World!"

    println(test)
    // test = "New String" // Can not do this.
    println(test+name2) // String concatenation


    var name = "Sagar Giri"
    var isAwesome = true

    println("Is $name awesome? The answer is : $isAwesome")


    var a = 3
    var b = 5
    println(a+b)

    val myName = "Sagar Giri" // myName is immutable
    var amIAwesome = true   // amIAwesome is mutable

    println("Is $myName awesome? The answer is : $amIAwesome")

    val firstFloat = 3.1415 // 64-bit
    val secondFloat = 3.1415f // 32-bit
    println(firstFloat + secondFloat)

    val longNum = 123456789456456L // 64-bit
    println(longNum)

    val aDouble = a.toDouble()
    print(aDouble)

    // To explicitly set types in the variable (Which is not necessary. Do this.
    val aa: Double = 3.1412
    val bb: Float = 3.1412f
    var cc: Long = 521425454L
    var dd: String = "Hello World"

    var hero: String? // ? is for to tell that it is empty variable
    hero = "Batman"
    println(hero)

}