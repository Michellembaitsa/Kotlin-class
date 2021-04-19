import java.util.ArrayList

fun main(){
var person=Mtu("Gyptian",35,"Kenyan")
    person.info("Hold")
    person.land(5,"Loitoktok")
    person.car("KDA 331G","Subaru","Forester")
    person.phone("Nokia",6.2.toFloat())

}
class Mtu(var name:String,var age:Int,var nationality:String){
    fun info(secondName:String){
        println("${name} ${secondName} is ${age}years old with a ${nationality} nationality.")
    }
    fun land(acre:Int,place:String){
        println("${name} owns a ${acre} acre land in ${place}.")
    }
   fun car( registration:String, model:String, make:String){
    println("${name} owns a ${model} ${make} of registration number ${registration}.")
}
    fun phone(model: String,make: Float){
        println("Owns a ${model} ${make}")
    }

}
