fun main(){
//    for [until, step, downTo]  while do while
    var i:Int = 2
     for (ij in 10 downTo 0){
         println("$i x $ij = ${i * ij}")
     }

    for (i in 0 until 9 step 5){
        print("$i\t")
    }
    print("\n")
    i=0
    while(i < 10){
        println("value of i is $i")
        i++
    }

    do{
        println("value of ji is $i")
        i--
    }while(i > 5)

}