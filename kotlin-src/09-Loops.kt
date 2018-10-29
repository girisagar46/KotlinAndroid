fun main(args: Array<String>) {
    val dc_heroes = arrayListOf("Batman", "Aqua Man", "Wonder Women", "Flash")
    for( hero in dc_heroes) {
        println("Hero name: $hero")
    }

    println("*".repeat(10))

    dc_heroes.forEach { s: String -> println("$s") }


    val langs = hashMapOf("python" to "Guido Van Rossum", "Java" to "James Gosling")

    for ((key, value) in langs) {
        println("$key : $value")
    }

    println("*".repeat(10))

    langs.forEach { t, u -> println("$t : $u") }

    println("*".repeat(10))

    var x = 10
    while (x > 0) {
        println(x)
        x--
    }
}