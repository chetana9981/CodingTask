import java.util.*

val age=fun(age:Int):String{
    if(age<18){
        return "You are not an adult"
    }
    else if(age>=18 && age<=55){
        return "You are an adult"
    }
    else {
        return "you are a senior citizen"
    }
}
fun main(args:Array<String>){
    var sc= Scanner(System.`in`)
    print("Enter the age to check: ")
    var age=sc.nextInt()
    val result = age(age)
    println(result)
}