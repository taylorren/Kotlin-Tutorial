fun main(args: Array<String>) 
{
    if(args.size==0) 
    {
        println("Not enough parameters");
        return;
    }
    println("Hello, ${args[0]}");
}