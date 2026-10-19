
fun main() {
    println("Hello, World!")
    println("My age is 21")
    println("My favorite programming language is Kotlin")

    print("Enter your first number: ")
    val a = readln().toInt()

    print("Enter your second number: ")
    val b = readln().toInt()

    println("Addition: ${a + b}")
    println("Subtraction: ${a - b}")
    println("Multiplication: ${a * b}")

    if (b != 0) {
        println("Division: ${a.toDouble() / b}")
    } else {
        println("Division is not possible because the second number is zero.")
    }

    val num = readln().toInt()
    if (num % 2 == 0){
        println("Number is even.")
    }
    else {
        println("Number is odd.")
    }
    println("Enter your Tempareture in celcius")
    val temp = readln().toDouble()
    // celcius to farenhite
        println("Tempareture is ${(temp * 1.8) + 32}")

    println("Enter your 1st number.")
    val st = readln().toInt()
    println("Enter your 2nd number.")
    val nd = readln().toInt()
    println("Enter your 3rd number.")
    val rd = readln().toInt()

    if (st >= nd && st >= rd){
        println("st is $st largest number.")
    }
    else if(nd >= st && nd >= rd){
        println("nd is $nd largest number.")
    }
    else{
        println("The largest number is $rd")
    }
    }



