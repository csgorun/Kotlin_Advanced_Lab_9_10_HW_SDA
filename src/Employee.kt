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

    fun updateSalary(value: Int) {
        salary = value
    }

    fun updateYearsOfExperience(value: Int) {
        yearsOfExperience = value
    }

    override fun generateReport(): String = println("ФИО: $fullName\nДолжность: $position\nЗарплата: $salary руб. \nСтаж работы: $yearsOfExperience ").toString()


}




fun main() {

    val test = Employee()

    test.generateReport()

    println("")

    test.updateSalary(-10)
    println("Зарплата: ${test.salary}")

    test.updateSalary(1)
    println("Зарплата: ${test.salary}")

    test.updateYearsOfExperience(60)
    println("Опыт: ${test.yearsOfExperience}")

    test.updateYearsOfExperience(-5)
    println("Опыт: ${test.yearsOfExperience}")

    test.updateYearsOfExperience(10)
    println("Опыт: ${test.yearsOfExperience}")


}
