```kotlin
fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)

    // Solution 1: Iterate in reverse
    for (i in list.size - 1 downTo 0) {
        if (list[i] % 2 == 0) {
            list.removeAt(i)
        }
    }
    println("Solution 1: $list")

    // Solution 2: Create a new list
    val newList = list.filter { it % 2 != 0 }.toMutableList()
    println("Solution 2: $newList")
}
```