abstract class Department {
    abstract val departmentName: String
    abstract fun printDepartmentGoal()
}

class DevelopmentDepartment:Department(),ReportGenerator {
    override val departmentName: String = "Разработка"
    override fun printDepartmentGoal() {
        println("Писать чистый код")

    }

    override fun generateReport(): String {
        return "===Информация об отделе===\n Название отдела: $departmentName\n Цель-писать чистый код"

    }
}

    class TestingDepartment : Department() {
        override val departmentName: String = "Тестирование"
        override fun printDepartmentGoal() {
            println("Находить все баги")
        }
    }

    fun main() {
        val development = DevelopmentDepartment()
        val testing = TestingDepartment()
        development.printDepartmentGoal()
        testing.printDepartmentGoal()
    }
