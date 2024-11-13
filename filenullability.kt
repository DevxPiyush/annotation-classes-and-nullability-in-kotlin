class User(
    val name :String
){
    fun cheer (){
        println("hello my name is $name")
    }
}
fun printuswrname(user:User?){
    println(user?.name)//safe call
    user?.cheer()
}
fun main(){
    printuswrname(User("jake"))
    println("***")
    printuswrname(null)//user is null , hence cheer function is not executed
}