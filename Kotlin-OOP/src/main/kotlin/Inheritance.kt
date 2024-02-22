/*Dengan teknik inheritance, kita bisa mengelompokkan properti dan fungsi yang sama.*/

/*
open class Animal(val name: String, val weight: Double, val age: Int, val isCarnivore: Boolean){
    open fun eat(){
        println("$name sedang makan")
    }
    open fun sleep(){
        println("$name sedang tidur")
    }
}

class Cat(pName: String, pWeight: Double, pAge: Int, pIsCarnivore: Boolean, val furColor: String, val numberOffeet: Int) : Animal(pName, pWeight, pAge, pIsCarnivore){
    fun playWithHuman(){
        println("$name bermain bersama manusia")
    }

    override fun eat(){
        // ketika ingin menambah implementasi yang sudah ada
        super.eat()
        println("$name sedang makan nasi")
    }
    override fun sleep(){
        println("$name sedang tidur di bantal")
    }
}

class Snake(pName: String, pWeight: Double, pAge: Int, pIsCarnivore: Boolean, val skinClor: String, val isToxic: Boolean) : Animal(pName, pWeight, pAge, pIsCarnivore){
    fun bite(){
        println("$name menggigit mangsa")
    }
    override fun eat(){
        println("$name sedang makan")
    }
    override fun sleep(){
        println("$name sedang tidur di kandang")
    }
}

fun main(){
    val kucing = Cat("Miaw", 3.2, 2, true, "brown", 4)
    kucing.playWithHuman()
    kucing.eat()
    kucing.sleep()

    println()

    val ular = Snake("bro", 5.1, 7, true, "batik", true)
    ular.bite()
    ular.eat()
    ular.sleep()

}*/
