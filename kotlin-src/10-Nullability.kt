fun main(args: Array<String>) {
    var name: String = "Sagar Giri"

    var nullanleName: String? = "Is Nullable" // ? indicates that it is null

//    nullanleName = null // After putting ? then we can assign null value to it

    // null check

    var length = 0
    if (nullanleName != null) {
        length = nullanleName.length
    } else {
        length = -1
    }
    println(length)

    var l = if (nullanleName != null) nullanleName.length else -1
    println(l)


    // Null safe call with ?

    println(nullanleName?.length)


    // Elvis operator
    var len = nullanleName?.length ?: -1
    println(len)

    // !! this introduces null pointer exception in yje code

//    print(nullanleName!!.length)
}