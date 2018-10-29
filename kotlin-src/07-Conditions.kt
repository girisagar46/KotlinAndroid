fun main(args: Array<String>) {
    val price = 150
    val account = 100

    if (account > price) {
        println("You can buy this")
    } else {
        println("LMAO you broke af!")
    }

    val percentage = 75
    if (percentage > 80) {
        println("Distinction")
    } else if (70 <= percentage && percentage < 80){
        println("First Division")
    } else {
        println("You've failed man. :( ")
    }

    val hungry = 3

    when(hungry) {
        1 -> println("Get Pizza")
        2 -> println("Get Burger")
        else -> println("Well let's eat anything.")
    }

    fun iAmFeeline(mood: String = "angry") {
        when(mood.toLowerCase()) {
            "angry" -> println("I am feeling $mood")
            "happy" -> println("I am feeling $mood")
            else -> print("well shit!")
        }
    }

    iAmFeeline("Happy")
    iAmFeeline("Grumpy")
}