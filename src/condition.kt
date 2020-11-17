fun main(){
    val isAdmin:Boolean = true
    val isKotlin = false
//    if condition
    if(isAdmin){
        println("You are The Admin Of This Code...")
    }

//    if else condition
    if (isKotlin){
        println("I think you know kotlin")
    }
    else{
        println("I hope You learning kotlin...")
    }
//    if else if .. else
    val name = "Shyam"

    if(name=="kumar"){
        println("Welcome $name ji")
    }else if(name=="yadav"){
        println("Welcome $name ji")
    }else{
        println("Welcome $name ji")
    }
//    when
    when(name){
        "shyam" -> {
            println("Welcome $name ji")
        }
        "kumar" -> {
            println("Welcome $name ji")
        }
        else -> {
            println("Welcome $name ji")
        }
    }
    
}