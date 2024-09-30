import kotlin.jvm.Throws

@Throws(ArithmeticException::class)
fun divide(a:Int , b:Int):Int{
    return a/b
}
@Throws(IllegalArgumentException::class)
fun findClusters(number:Int){
    fun findClusters(number: Int){
        if (number<1) throw IllegalArgumentException("the number if clusters cannot be smaller than 1 , it is $number")
    }
}
fun main(){
    println("This code is running successfully")
}
