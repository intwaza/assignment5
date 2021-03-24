fun main() {
    var x=Human("Belyse",20,68.0.toFloat())
    x.eat(3)
    println(x.weight)

    x.speak("Hi")

    x.birthday()
    println(x.age)


    var Person= User("Intwaza","Belyse","iintwazabelyse@gmail.com","0787850041","myname")
    println(Person.firstName)
    println(Person.Email)
}


class Human(var name:String, var age:Int, var weight:Float){
    fun eat(foodweight: Int):Float{
        println("I am eating $foodweight kgs of food")
        weight= weight+ foodweight
        return weight
    }

    fun speak(speech:String){
        println(speech)
    }

    fun birthday(){
        age++
    }
}
data class User(var firstName: String, var lastName:String, var Email:String, var phonenumber:String, var password:String)