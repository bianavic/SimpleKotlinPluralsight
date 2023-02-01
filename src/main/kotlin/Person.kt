class Person(var Name: String) {

    fun display() {
        println("Display: $Name")
    }

    fun displayWithLambda(func: (s: String) -> Unit) { //lambda function call the function passed in
        func(Name)
    }

}