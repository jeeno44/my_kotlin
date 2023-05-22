import java.time.Clock as cl

fun main(args: Array<String>) {
    println("Hello World!")
    println("Понятно сука!!!")

    var mina:Int = 100

    while (mina < 150){
        println("yes = " + mina.toString())
        mina += 1
    }

    println(mina.toInt()::class.java.typeName)

//    for (i in 0..50 step 3)
//        println(i.toString() + " Порядок")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}