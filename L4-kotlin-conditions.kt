fun main() {
    val temperature = 25
    
    if (temperature > 30) {
        // Code executé si la condition est true
        println("Il fait chaud")
    } else {
        // Code executé si la condition est false
        println("Il fait bon")
    }
    
    val age = 18 // Int
    val isAdult = if(age >= 18) true else false
    
    
    
    val dayOfWeek = 10
    
    val dayName = when (dayOfWeek) {
        1 -> "Lundi"
        2 -> "Mardi"
        3 -> "Mercredi"
        4 -> "Jeudi"
        5 -> "Vendredi"
        6 -> "Samedi"
        7 -> "Dimanche"
        else -> "--"
    }
    
    println(dayName)
    
    
    
    val num = 10
    
    
    when {
        num % 2 == 0 -> println("Nombre pair")
        num % 2 != 0 -> println("Nombre impair")
    }
    
    
    
    val name: String? = "Ramzy"
    val displayName = name ?: "Guest"
    
    
    println(displayName)
 
}