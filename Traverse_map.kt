/**
 *  Kotlin Standard Library provide component functions for Map.Entry
 */

fun main(args: Array<String>) {
    val map = hashMapOf<String, Any>()
    map.put("one", 1)
    map.put("two", 2)
    map.put("Archer", "Robin")

    for ((key, value) in map) {
        println("key = $key, value = $value")
    }
}