interface ReportGenerator {
    fun generateReport(): String
}

fun main() {
    val reportGenerator: List<ReportGenerator> = listOf(
        Employee("Иванов Иван Иванович","художник",40000,10),
        DevelopmentDepartment()
    )
    for (i in reportGenerator){
        println(i.generateReport())
        println()
    }
}