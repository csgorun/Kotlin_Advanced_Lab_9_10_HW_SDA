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