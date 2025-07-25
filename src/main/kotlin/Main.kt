//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main(args: Array<String>) {
    // Hello World!
    val name="Vahid"
    val city="NYC"
    println("Hello $name from $city!")
    for(num in 1..5){
        if(num%2==0) println("Num $num is even!")
        else println("Num $num is odd!")
    }
    println(args.joinToString(separator = ", "))
    // Boolean variables
    var boolVar=true
    println(boolVar)
    boolVar=false
    println(boolVar)
    println(boolVar==true)
    println(boolVar==false)
    // Numeric variables
    var aInt:Int= 10
    var aLong:Long=1_000_000_000
    var aFloat:Float=1.5f
    var aDouble:Double=2.5
    println("The Int value of the Double value $aDouble is ${aDouble.toInt()}")
    // Char and String
    val aChar:Char='a'
    val aString:String="Hello Kotlin!"
    val aMultiLineString="""
               >>Some
               Multi
                    Line
           text!
    """
    println(aMultiLineString)
    println(aMultiLineString.trimIndent())
    println(aMultiLineString.trimMargin(">>"))
    println(aString.isNotEmpty())
    println(aString.isNotBlank())
    println(aString.contains("Kotlin"))
    // Functions
    printGreeting()
    printGreeting("Hey")
    printGreeting(thingToGreet = "Kotlin")
    printGreeting(greeting = "Hey", thingToGreet = "Kotlin")
    println(getGreeting())
    // Function types
    println("Function types:")
    greetingFun1()
    println(greetingFun2("Kotlin"))
    greetingFun2 = { thingToGreet->
        "Hello $thingToGreet!"
    }
    println(greetingFun2("Kotlin"))
    // Higher-order functions
    println("Higher-order functions:")
    printCalculatedValue(2,2) { a, b -> a + b }
    printCalculatedValue(2,2) { a, b -> a - b }
    // Challenge section 3
    println("Challenge section 3:")
    printFullName("Mohammad", "Vahid Alizadeh"){a,b -> "$a $b"}
    printFullName("Mohammad", "Vahid Alizadeh"){a,b -> "$a, $b"}
    printFullName("Mohammad", "Vahid Alizadeh"){a,b -> fancyFormat(a, b)}
}
fun fancyFormat(firstName: String, lastName: String): String{
    return "The first name is $firstName and the last name is $lastName."
}
fun printFullName(firstName: String, lastName: String, format: (String, String)->String){
    println(format(firstName, lastName))
}
fun printCalculatedValue(value1: Int, value2: Int, operation: (Int, Int) -> Int){
    println("The result of the operation is ${operation(value1, value2)}")
}
var greetingFun1: () -> Unit= {
    println("Hello Kotlin")
}
var greetingFun2: (String) -> String={ thingToGreet->
    "Hello $thingToGreet"
}
fun printGreeting(greeting: String = "Hello", thingToGreet: String = "Kotlin"){
    println("$greeting $thingToGreet!")
}
fun getGreeting(greeting: String = "Hello", thingToGreet: String = "Kotlin"):String{
    return "$greeting $thingToGreet!"
}