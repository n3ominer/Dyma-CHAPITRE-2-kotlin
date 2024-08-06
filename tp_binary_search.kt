fun main() {
    // Création des deux listes non triées
    val list1 = listOf(10, 3, 5, 7, 8)
    val list2 = listOf(2, 6, 9, 4, 1)

    // Fusion des deux listes
    val mergedList = list1 + list2

    // Tri de la liste fusionnée
    val sortedList = mergedList.sorted()

    // Fonction de recherche binaire
    fun binarySearch(list: List<Int>, target: Int): Int {
        var low = 0
        var high = list.size - 1

        while (low <= high) {
            val mid = (low + high) / 2
            val guess = list[mid]

            if (guess == target) {
                return mid
            }
            if (guess > target) {
                high = mid - 1
            } else {
                low = mid + 1
            }
        }
        return -1 // Élément non trouvé
    }

    // Test de la fonction de recherche binaire
    val target = 6
    val index = binarySearch(sortedList, target)
    if (index != -1) {
        println("L'élément $target est trouvé à l'index $index dans la liste triée.")
    } else {
        println("L'élément $target n'est pas trouvé dans la liste triée.")
    }
}