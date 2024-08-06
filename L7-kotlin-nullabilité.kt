var name: String? = "Ramzy"
    
    
name?.let { it ->
    println("La longueur de la variable name est : ${it.length}")
}


val list: List<String?> = listOf(null, "Bob", "Alice",  "Ramzy")
val firstNonNullElement = list.find { it -> it != null}

println(firstNonNullElement)