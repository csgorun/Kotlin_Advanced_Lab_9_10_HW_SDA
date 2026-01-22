class Task(val name: String, var isCompleted: Boolean = false)

class Employee : ReportGenerator{

    private var fullName: String = "SDA"
    private var position: String = "Manager"

    var salary: Int = 100
        private set(value) {
            if (value < 0) {
                println("Ошибка: зарплата не может быть отрицательной")
            } else {
                field = value
            }
        }

    var yearsOfExperience: Int = 1
        private set(value) {
            if (value > 50) {
                println("Опыт работы не может быть больше 50 лет")
                field = 50
            } else if (value < 0) {
                println("Опыт работы не может быть меньше 0 лет")
            } else {
                field = value
            }
        }
    var currentTask: Task? = null
        private set



    fun updateSalary(value: Int) {
        salary = value
    }

    fun updateYearsOfExperience(value: Int) {
        yearsOfExperience = value
    }

    override fun generateReport(): String {
        return "ФИО: $fullName\nДолжность: $position\nЗарплата: $salary руб. \nСтаж работы: $yearsOfExperience "
    }

    fun assignTask(newTask: Task) {
        val task = currentTask
        if (task != null && !task.isCompleted) {
            println("Сотрудник уже занят задачей '${task.name}'")
        } else {
            currentTask = newTask
            println("Задача '${newTask.name}' назначена сотруднику $fullName")
        }
    }




}




fun main() {

    val test = Employee()

//    test.generateReport()
//
//    println("")
//
//    test.updateSalary(-10)
//    println("Зарплата: ${test.salary}")
//
//    test.updateSalary(1)
//    println("Зарплата: ${test.salary}")
//
//    test.updateYearsOfExperience(60)
//    println("Опыт: ${test.yearsOfExperience}")
//
//    test.updateYearsOfExperience(-5)
//    println("Опыт: ${test.yearsOfExperience}")
//
//    test.updateYearsOfExperience(10)
//    println("Опыт: ${test.yearsOfExperience}")





    val task1 = Task("Написать модуль авторизации")
    val task2 = Task("Проверка багов в системе")

    test.assignTask(task1)
    test.assignTask(task2)

    println()
    println(test.generateReport())


    task1.isCompleted = true
    test.assignTask(task2)

    println()
    println(test.generateReport())



}
