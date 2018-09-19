fun main(args: Array<String>) {

    println("Enter your name: ")
    var name= readLine()

    println("Hello " + name)

    println("Enter your age: ")
    var age= readLine()!!.toInt()  // this is type conversion because readline() takes in string.

    print("You age " + age)
}