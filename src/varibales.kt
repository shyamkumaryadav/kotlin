fun main(){
//    var => name:Type = value => Type check
//    val => name:Type = value => Val cannot be reassigned
    var a:String = "This is Type of String"
    val b:Int = 46
    a = 45.toString()
//    b= 48 `Error: Val cannot be reassigned`
    println("a => $a\nb => $b")
}