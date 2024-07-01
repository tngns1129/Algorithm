import java.util.Scanner

fun main(){
    val sc = Scanner(System.`in`)
    val a = sc.nextBigInteger()
    val b = sc.nextBigInteger()
    println(a.add(b))
    println(a.subtract(b))
    println(a.multiply(b))
}