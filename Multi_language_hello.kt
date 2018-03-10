fun main(args: Array<String>) 
{
    val language=if(args.size==0) "EN" else args[0]

    println(when(language) 
    {
        "EN" -> "Hello!"
        "FR" -> "Salut!"
        "IT" -> "Ciao!"
        "CN" -> "你好！"
        else -> "Sorry, not able to greet you in $language yet."

    })
}