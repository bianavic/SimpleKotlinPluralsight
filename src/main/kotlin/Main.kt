fun main(args: Array<String>) {
    println("Hello World!")

    val kevin = Person("Kevin")

    println("Name is ${kevin.Name}")

    kevin.Name = "Steve"

    println("Name is ${kevin.Name}")

    kevin.display()

    kevin.displayWithLambda(::printName)

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}

fun printName(name: String) {
    println(name)
}