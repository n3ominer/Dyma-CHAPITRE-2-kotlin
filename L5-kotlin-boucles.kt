fun main() {
    for (i in 0..<10) {
        // Pour chaque élément, faire quelque chose
        print("$i ")
    }
    println("")
    
    val fruits = listOf("Pomme", "Banane", "Orange")
    
    for( index in fruits.indices) {
        println("Le fruit à la position $index : ${fruits[index]}")
    }
    
    
    var compteur = 0
    
    while(compteur <= 5) {
        // Du code
        println(compteur)
        compteur += 1
    }
    
    
    var cpt = 10
    
    while(cpt >= 0) {
        if (cpt % 2 == 0) {
            println("$cpt est un nombre pair")
        }
        cpt -= 1
    }
    
    
    
    var count = 1
    
    do {
        println(count)
        count += 1
    } while (count <= 5)
    