class Employee (
    fullName: String,
    position: String,
    salary: Int,
    yearsOfExperience: Int) :ReportGenerator
{
    var fullName: String=fullName
        get() = field
    var position: String=position
        get() = field
    var salary: Int=salary
        get() = field
        set(value) {
            if (value<0){
                println("Число не может быть отрицательным. Значение стало 0")
                field=0
            } else{
                field=value
            }
        }
    var yearsOfExperience: Int=yearsOfExperience
        get() = field
        set(value) {
            field=value.coerceIn(0,50)
        }

    override fun generateReport(): String {
        return "===Отчет о сотруднике===\n ФИО: $fullName\n Должность: $position\n Зарплата: $salary\n Опыт работы: $yearsOfExperience"
    }
}

fun main() {
    val employee=Employee("Александров Александр Александрович","Менеджер",50000, 6)
    println("Зарплата ${employee.salary}")
    employee.salary=-3
    employee.salary=55000
    println("Зарплата ${employee.salary}")

    println("Опыт ${employee.yearsOfExperience}")
    employee.yearsOfExperience=90
    println("Опыт ${employee.yearsOfExperience}")
}
