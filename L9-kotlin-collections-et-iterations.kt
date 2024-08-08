fun main() {
    // Listes
	val immutableList = listOf("Pomme", "Banane", "Orange") // List
	
    val mutableList = mutableListOf("Pomme", "Banane", "Orange") // MutableList
    
    println(mutableList)
    
    mutableList.add("Kiwi")
    mutableList.remove("Pomme")

    println(mutableList)
    
    
    // Ensembles
    val immutableSet = setOf("Pomme", "Banane", "Orange")
    val mutableSet = mutableSetOf("Pomme", "Banane", "Orange")
    
    mutableSet.add("Poire")
    
	println(mutableSet)
    
    
    // Dictionnaires
    val mutableMap = mutableMapOf("name" to "Alice", "age" to 30)
    
    mutableMap["city"] = "Paris"
    
    println(mutableMap)
    
    val numbers = listOf(1, 2, 3, 4)
    val numbersX2 = numbers.map { it * 2 } // 2, 4, 6, 8
    
    println("List before transformation: $numbers")
    println("List after transformation: $numbersX2")
    
    
    val numbersFiltered = numbersX2.filter { it > 3 }
    println("List after filter: $numbersFiltered")
    
    
    val numbersSum = numbersFiltered.reduce { a, b -> a + b }
    println("List elements sum: $numbersSum")
    
    
    val list2 = listOf(1, 1, 2, 3, 4, 4, 4, 4, 5, 6, 7, 8, 10)
	println("Liste complère: $list2")
    val distincsNumbers = list2.distinct()
    
    println("Doublons supprimés de la liste: $distincsNumbers")
    
    val fusionList = (numbersFiltered + list2).distinct().sortedBy {it}
    
    println("Fusion de listes: $fusionList")
    
    
    
    
    val numbers2 = listOf(1, 2, 3) // [1, 2, 2, 4, 3, 6]
    
    val flattened = numbers2.flatMap { it ->  listOf(it, it * 2)}
    println(flattened)
    
    
    
    
    
    
    
   
    
}