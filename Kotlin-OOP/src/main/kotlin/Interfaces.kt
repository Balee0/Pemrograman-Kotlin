/*Interfaces merupakan suatu konsep sifat umum yang nantinya digunakan oleh suatu kelas agar dapat memiliki sifat tersebut.
Interface sangat mirip dengan abstract class, namun tanpa sebuah properti deklarasi dan fungsi yang dideklarasikan tanpa isi.
Tujuan dari interface ini hanya untuk diimplementasikan oleh sebuah kelas.
Kelas yang mengimplementasikan sebuah interface diharuskan melakukan override seluruh properti
dan fungsi sekaligus mendefinisikan isi fungsi yang terdapat pada interfaces-nya.*/

/*
class Bird(override val numberOfWings: Int) : IFly {
    override fun fly() {
        if(numberOfWings > 0) println("Aku terbang menggunakan sayap")
        else println("Aku terbang tidak menggunakan sayap")
    }
}

interface IFly {
    fun fly()
    val numberOfWings: Int
}

abstract class Animal(){
    abstract val age: Int
    open val isEating = true
    val isRespire = true
}

interface IWalk{
    val numberOfLeg: Int
    fun walk()
}

interface IDrink{

}

class Camel : Animal(), IWalk, IDrink {
    override val age:Int =7
    override val isEating = true
    override val numberOfLeg:Int = 2
    override fun walk() {
        println("Camel can Walk")
    }
}

fun main(){
    val camel =Camel()
    camel.walk()
}
*/

