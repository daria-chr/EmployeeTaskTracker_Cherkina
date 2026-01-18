enum class Priority{
    LOW, MEDIUM,HIGH
}
data class Task (
    val title: String,
    val description: String,
    val priority: Priority,
    var isCompleted: Boolean=false
)

fun main() {
    val task1=Task("Всем привет","какой хороший день", Priority.HIGH)
    val task2=Task("Всем привет","какой хороший день", Priority.HIGH)
    val task3=Task("Всем пoка","какой плохой день", Priority.LOW)

    println(task1.equals(task2))
    println(task1.equals(task3))
    println(task1.equals(task1))
    println(task2.equals(task2))
    println(task2.equals(task3))
    println(task2.equals(task1))
    println(task3.equals(task2))
    println(task3.equals(task3))
    println(task3.equals(task1))

    println(task1.hashCode())
    println(task2.hashCode())
    println(task3.hashCode())

    val task1copy=task1.copy(priority=Priority.MEDIUM)
    println("$task1copy")

    println(task1.toString())
    println(task2.toString())
    println(task3.toString())
}