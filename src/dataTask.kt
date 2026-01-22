enum class Priority{
    low,medium,high
}

data class dataTask(
    val title: String,
    val description: String,
    val priority: Priority,
    val isCompleted: Boolean


) {


}
fun main(){
    val tasks1 = dataTask("Математика","2+2",Priority.low, false)
    val tasks2 =  tasks1.copy()
    val tasks3 = dataTask("Rust","Понять язык Rust",Priority.high, false)
    val tasks4 = dataTask("C#","Понять язык C#",Priority.medium, false)
    println(tasks1.toString())
    println(tasks1.equals(tasks2))
    println(tasks4.hashCode())


}