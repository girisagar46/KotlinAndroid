fun main(args: Array<String>) {


    var x = 10
    var name1 = "Sagar"

    var y:Int = 20
    var name2:String = "Sagar" // Here datatype :String is not really required since value is assigned to it
    // name2 = 5 // Can't do this


    val test:String? // This needs datatype because it is an empty variable. val makes it immutable
    test = "Hello World!"

    println(test)
    // test = "New String" // Can not do this.
    print(test+name2) // String concatenation
}