abstract class Department {
    abstract var departmentName : String
    abstract fun printDepartmentGoal():String
}
class DevelopmentDepartment : Department(),ReportGenerator {
    override var departmentName : String = "Development"
    override fun printDepartmentGoal():String {
        return "Писать чистый код"
    }
    override fun generateReport(): String {
        return "Информация об отделе:\nНазвание отдела: $departmentName\nЦель отдела: ${printDepartmentGoal()}"
    }
}
class TestingDepartment : Department() {
    override var departmentName : String = "Testing"
    override fun printDepartmentGoal():String {
        return "Находить все баги"
    }
}
fun main(){
    val dev=DevelopmentDepartment()
    val test=TestingDepartment()
    println("Цель отдела ${dev.departmentName}: ${dev.printDepartmentGoal()}")
    println("Цель отдела ${test.departmentName}: ${test.printDepartmentGoal()}")
    println()
    println(dev.generateReport())
}