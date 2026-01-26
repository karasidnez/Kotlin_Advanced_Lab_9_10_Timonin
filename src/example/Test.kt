package example

var age: Int = 18
    set(value) {
        if ((value > 0) and (value < 110))
            field = value
    }
data class Item(
    val id: Int,
    val name: String,
    val quantity: Int
){
    override fun toString(): String {
        return "Id предмета: $id\nИмя: $name\nКоличество: $quantity\n"
    }
}
abstract class Human(val name: String){
    abstract var age: Int
    abstract fun hello()

}

fun main() {
//    println(example.age) // 18
//    example.age = 45
//    println(example.age) // 45
//    example.age = -345
//    println(example.age) // 45
//    val sword = example.Item(1,"Sword", 1)
//    val betterSword = sword.copy(quantity = 2)
//    println(sword.toString())
//    println(betterSword.toString())
//    val(id,name,quantity) = betterSword
//    println("Id предмета: $id\nИмя: $name\nКоличество: $quantity\n")
//    val pavel: example.Human = example.Human("Pavel")
class Person(name: String, override  var age : Int): Human(name){
    override fun hello(){
        println("My name is $name")
    }
}
    val denis: Person = Person("Denis",1)
    val maksim: Human = Person("Maksim",2)
    denis.hello()
    maksim.hello()


}