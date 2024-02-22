/*Abstraction adalah konsep di mana Anda menyembunyikan detail tertentu dari implementasi suatu objek
dan hanya menunjukkan fungsionalitas yang relevan atau penting bagi pengguna objek tersebut.*/

abstract class Animal(var name: String, var weight: Double, var age: Int, var isCarnivore: Boolean){

    fun eat(){
        println("$name sedang makan !")
    }

    fun sleep(){
        println("$name sedang tidur !")
    }
}

fun main(){
    val animal = Animal("dicoding animal", 2.6, 1, true)
}

// Output: cannot create an instance of an abstract class