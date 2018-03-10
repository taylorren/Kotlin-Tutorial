package multiplier

fun parseInt(str: String):Int? {
    try {
        return str.toInt()
    }
    catch (e: NumberFormatException) {
        println("One of the arguments is not able to be parsed as integer")
    }
    return null
}

fun main(args: Array<String>) {
    if(args.size<2) {
        println("No number provided")
    }
    else {
        val x=parseInt(args[0])
        val y=parseInt(args[1])

        if(x!=null && y!=null) {
            println(x*y)
        }
        else {
            println("One of the arguments if null!")
        }
    }
}