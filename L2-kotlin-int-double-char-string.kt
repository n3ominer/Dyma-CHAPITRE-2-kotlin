fun main() {
    val age: Int = 25
    var temperature: Int = -10
	
	val pi: Double = 3.14158021312
    
    val ageFlottant = age.toDouble()
    val approxPi = pi
    
    println(age)
    println(ageFlottant)


    val symbole: Char = '#'
    val value1: Char = '1'
    
    val mot: String = "$symbole$value1" // #1
    print(mot)
    
    val salutation: String = "Hello world!"
    
     val description: String = """
    	Kotlin est un super langage.
        Il est concis et sûr !
    """.trimIndent()
    
    print(description)

    val string1: String = "Chaine n°1 -"
    val string2: String = "Chaine n°2"
    
    val string3 = string1 + string2

    println(string3)
}