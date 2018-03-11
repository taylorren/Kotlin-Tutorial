/*
 * Your task is to implement the sum() function so that it computes the sum of
 * all elements in the given array a.
 */
package sum

fun sum(a: IntArray): Int {
    var total: Int=0;
    for (num in a) {
        total+=num;
    }

    return total;
}

fun main(args: Array<String>) {
    val a =IntArray(5);
    for (i in 1..5) {
        a[i-1]=i
    }

    println(sum(a));
}
