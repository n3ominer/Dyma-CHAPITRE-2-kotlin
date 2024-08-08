fun main() {
    // Création de listes
    val list1 = listOf(10, 2, 5, 18, 9, 25, 3)
    val list2 = listOf(8, 7, 14, 30, 1, 4, 22, 50)
    
    // Fusionner les liste pour avoir une liste complète
    val mergedList = list1 + list2
    
    println("Liste fusionnée: $mergedList")
    
    val sortedList = mergedList.sorted()
    
    println("Liste triée: $sortedList")
    
    // Test de la recherche par dichotomie
    val target = 7
    val targetIndex = binarySearch(listOf(1, 3, 4, 6, 7, 8, 10, 13, 14, 18, 19, 21, 24, 37, 40, 45, 71), target)
    
    if (targetIndex != -1) {
        println("L'élément $target a été trouvé à l'index $targetIndex")
    } else {
        println("L'élément $target n'a pas été trouvé !")
    }
    
    
    //dumbSearch(sortedList, target)
}


fun binarySearch(list: List<Int>, target: Int): Int {
    var low = 0
    var hight = list.size - 1

    var counter = 0
    
    while(low <= hight) {
        counter += 1
        
        val middle = (low + hight) / 2
        val guess = list[middle]
        
        if (guess == target) {
            println("$counter tours de boucles pour trouver l'élément")
            return middle // Element trouvé
        }
        if (guess > target) {
            hight = middle - 1
        } else {
            low = middle + 1
        }
    }
    
    println("$counter tours de boucles éffectués")
    return -1 // Element non trouvé
}