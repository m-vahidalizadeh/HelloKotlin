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
}