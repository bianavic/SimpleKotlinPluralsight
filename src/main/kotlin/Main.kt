fun main(args: Array<String>) {
    println("Hello World!")

    val kevin = Person("Kevin")

    println("Name is ${kevin.Name}")

    kevin.Name = "Steve"

    println("Name is ${kevin.Name}")

    kevin.display()

    kevin.displayWithLambda(::printName)

    val q = Question()  // immutable

//    q = Question() // var = mutable

    q.Answer = "42"
//    q.Question = "" // can't be declare because it' s immutable

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}

fun printName(name: String) {
    println(name)
}
class Question {
    var Answer: String = "" // mutable
    val Question: String = "What is the answer to life, the universe and everything?" // immutable
}