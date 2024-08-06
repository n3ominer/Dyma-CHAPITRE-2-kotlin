fun main() {
    
    val a = 10 // Int
    val b = 5 // Int
    
    val sum = a + b // 15
    val diff = a - b // 5
    val product = a * b // 50
    val quotient = a / b // 2
    
    
    val reste = a % b // 0
    
	val isGreaterOrEqual = (a >= b)    
    val isGreater = (a > b)
   	val isLessOrEqual = (a <= b)    
    val isLess = (a < b)
    val isEqual = (a == b)
    val isDifferent = (a != b)
    
    // AND (&&)
    val isTrue = (a > 0) && (b > 0) // true
    
    // OR (||)
    val isTrue2 = (a > 0) || (b > 0) // true
    
    // NOT (!)
    val isFalse = !(a > 0)
    
    
    var x = 5
    
    x += 3 // x = x + 3
    x -= 3 // x = x - 3
    x *= 3 // x = x * 3
    x %= 3 // x = x % 3
    
    print(x)
    
}