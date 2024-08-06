val isConnected: Boolean = false
    var hasError: Boolean = true
    
    val isValid = true // Boolean
    
    
    
    // AND(&&) prend 2 booléens et renvoie true si les 2 sont true
    //                                  false       || true
    val isUserAuthorized = (isConnected && isValid) || hasError
    
    println(isUserAuthorized)
    
	// OR (||) prend 2 booléens et renvoie true si au moins un des 2 est true 
    val thirdrBool = isUserAuthorized || hasError
    println(thirdrBool)
    
	// NOT (!) prend 1 booléen et renvoie la valeur inverse
    val notValid = !isValid
    println(notValid)
    
    
    val a = 10 
    val b = 12
    
    val isGreater = (a > b) // false
    val isEqual = (a == b) // false
    val isLess = (a < b) // true
    
    println(isGreater)
    println(isEqual)
    println(isLess)
    
    val age = 25
    val isYoung = age in 18..30
    
    println(isYoung)
    
    
    val isTrue = true
    
    val complexeBoolean = isTrue || isConnected
    
    
    
    val status = if(isConnected) "Connecté" else "Déconnecté"
    println(status)