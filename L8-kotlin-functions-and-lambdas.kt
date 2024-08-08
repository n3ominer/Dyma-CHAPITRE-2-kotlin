fun main() {
    val salutationMessage = salutation()
    println(salutationMessage)
    
    val sum = { a: Int, b: Int -> a + b }

    println(sum(3, 5))
    
    
    val numbers = listOf(1, 2, 3, 4, 5, 6)
    val evenNumbers = numbers.map { it * 2}
    
    println(evenNumbers)
    
    
    val buiildString = StringBuilder().apply {
        append("Hello, ")
        append("World!")
    }.toString()
    println(buiildString)
    
    
    
    val result = operationOnNumbers(5, 12) {x, y -> x * y}
    println(result)
}

fun salutation(name: String = "Guest", age: Int = 20): String {
    return "Hello, $name !"
}


fun operationOnNumbers(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}