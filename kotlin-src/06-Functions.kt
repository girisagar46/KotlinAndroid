fun main(args: Array<String>) {

    fun square(num: Int): Int {
        return num * num
    }

    println(square(5))

    fun sayDialogue(dialogue: String) {
        print(dialogue)
    }

    sayDialogue("Run Forrest Run!")

    fun sum(a: Int, b: Int): Int {
        return a+b
    }

    println("Result ${sum(5, 10)}")
    println("The sum of 5 and 10 is ${5+10}")

    fun myMood(mood: String = "Angry") {
        println(mood)
    }

    myMood()
    myMood("Happy")
}