/**
 * Kotlin does not have collection classes
 * In Kotlin, collection classes are built on top of Java collection
 * but their functionality are extended in Kotlin
 */

fun main(args: Array<String>) {

    // Arrays/ List

    // listOf is immutable array list
    val marvel_heroes = listOf("Iron Man", "Spider Man", "Captain America")
    println(marvel_heroes)
    println(marvel_heroes.sorted())
    println(marvel_heroes[0])
    println(marvel_heroes.first())
    println(marvel_heroes.last())
    println(marvel_heroes.contains("Iron Man"))
    println(marvel_heroes.contains("Black Panther"))
    println(marvel_heroes.sorted()[0])
    println(marvel_heroes.sorted().reversed())

    // arrayListOf is mutable array list
    val dc_heroes = arrayListOf("Batman", "Aqua Man", "Wonder Women", "Flash")
    println(dc_heroes)
    println(dc_heroes.size)
    dc_heroes.add("Deadshot")
    println(dc_heroes)
    dc_heroes.add(0, "Harley Queen")
    println(dc_heroes)
    println(dc_heroes.indexOf("Batman"))
    dc_heroes.remove("Deadshot")
    println(dc_heroes)

    // Map

    // Immutable
    val languages = mapOf("python" to "Guido Van Rossum", "Java" to "James Gosling")
    println(languages)
    println(languages["python"])
    println(languages.get("python"))
    println(languages.getOrDefault("C", "Entry not found"))
    println(languages.size)
    println(languages.entries)
    println(languages.keys)
    println(languages.values)


    // Mutable
    val langs = hashMapOf("python" to "Guido Van Rossum", "Java" to "James Gosling")
    println(langs["python"])
    langs["python"] = "Monty Python"
    println(langs)
    langs.put("Java", "Coffee Beans")
    println(langs)
    langs.remove("Java")
    println(langs)
    langs.clear()
    println(langs)
    print(langs.isEmpty())


}