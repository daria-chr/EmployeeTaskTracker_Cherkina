class Employee (
    fullName: String,
    position: String,
    salary: Int,
    yearsOfExperience: Int) :ReportGenerator
{
    var currentTask: Task?=null
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
    fun assignTask(newTask: Task) {
        val cur=currentTask
        if (cur!= null && cur.isCompleted){
            println("Сотрудник уже занят задачей ${cur.title}")
        }else{
            currentTask=newTask
            println("Задача ${newTask.title} назначена")
        }
    }
}

fun main() {
    val employee=Employee("Александров Александр Александрович","Менеджер",50000, 6)
    val task1=Task("Работа", "сделать все задания",Priority.HIGH)
    val task2=Task("Отдых", "спать",Priority.LOW)
    println("Зарплата ${employee.salary}")
    employee.salary=-3
    employee.salary=55000
    println("Зарплата ${employee.salary}")

    println("Опыт ${employee.yearsOfExperience}")
    employee.yearsOfExperience=90
    println("Опыт ${employee.yearsOfExperience}")

    println("Фио ${employee.fullName}")
    println("Должность ${employee.position}")
    println("Зп ${employee.salary}")
    println("Опыт работы ${employee.yearsOfExperience}")
    val developmentDepartment=DevelopmentDepartment()
    println(developmentDepartment.generateReport())

    employee.assignTask(task1)
    employee.assignTask(task2)
}
