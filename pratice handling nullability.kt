//step 1
data class Student(val fullName: String, var id: Int,var grade:Double)

val students = listOf<Student>(
    Student("Nandini Jambhulkar", 12,98.0),
    Student("Aman Ramagade", 1,75.0),
    Student("Apurv Gore", 3,87.0),
    Student("Shreyash Damodar", 78,92.0)
)


fun main() {
    println("Please, Enter the student's ID")
    val id = readln().toInt()
    println( getStudentById(id))
    println("Please, Enter the student's name")
    val name= readln() // taking input from user
    println(searchInStudents(name)?:"the student is not found")
}

fun getStudentById(id:Int):Student{
    return  students.find { it.id==id }!!
}
fun searchInStudents(name:String):Student?{
    return students.find { it.fullName.lowercase()==name.lowercase()}
}