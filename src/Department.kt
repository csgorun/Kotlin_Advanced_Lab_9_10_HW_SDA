abstract class Department {
    abstract var departmentName : String
    abstract fun printDepartmentGoal()
}
class DevelopmentDepartment : Department() {
    override var departmentName : String = "Development"
    override fun printDepartmentGoal() {
        println("Цель отдела $departmentName : писать чистый код")
    }
}
class TestingDepartment : Department() {
    override var departmentName : String = "Testing"
    override fun printDepartmentGoal() {
        println("Цель отдела $departmentName : находить все баги")
    }
}

fun main(){
    val dev=DevelopmentDepartment()
    val test=TestingDepartment()
    println(dev.printDepartmentGoal())
    println(test.printDepartmentGoal())
}