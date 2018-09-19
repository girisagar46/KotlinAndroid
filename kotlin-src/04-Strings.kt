fun main(args: Array<String>) {
    val str = "Daal Bhat power, 24 hour"
    println(str)

    val str1 = "He said \"$str\""
    println(str1)

    // Multiline string
    val multiLine = """
        Hello World $
        This is awesome
        Hey there
    """
    println(multiLine)

    val multiLine2 = """
        This is awesome
        Hey there
    """.trimIndent()
    println(multiLine2)


    val multiLine3 = """ | Margin Here
        | Margin There
    """.trimMargin("|")
    println(multiLine3)

    val myString = "Hello"
    for(char in myString) {
        println(char)
    }

    // Useful methods in Kotlin string

    println(myString.equals("Hello"))
    println(myString == "Hello")
    println(myString.replace("H", "X"))
    println(myString.contains("C"))
    println(myString.contains("L"))
    println(myString.contains("L", ignoreCase = true))
    println(myString.toLowerCase())
    println(myString.toUpperCase())
    println(myString.toBoolean())
    println(myString.plus("DSDS"))
    println(myString.substring(1, myString.length))
    println(myString.subSequence(1, 3))


    // String templates
    val fname = "Sagar"
    val lname = "Giri"
    val fullName = "$fname $lname"
    println(fullName)
}