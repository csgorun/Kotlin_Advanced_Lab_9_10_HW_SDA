interface ReportGenerator{
    fun generateReport():String
}

class Sotrudnik(private val name: String): ReportGenerator{
    override fun generateReport():String{
        return "Сотрудник: $name"
    }
}
class Otdel(private val departmentName: String): ReportGenerator {
    override fun generateReport(): String {
        return "Отдел: $departmentName"
    }
}

fun main(){
    val list: List<ReportGenerator> = listOf(
        Sotrudnik("Маркин"),
        Otdel("Разработки"),
        Sotrudnik("Шапкин"),
        Otdel("Тестирования")
    )

    for (item in list) {
        println(item.generateReport())
    }

}


