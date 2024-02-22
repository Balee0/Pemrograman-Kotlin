/*Seconday Constructor
* digunakan ketika kita ingin menginisialisasi sebuah kelas dengan cara yang lain.*/

/*
class Animal(name: String, Weight: Double, Age: Int){
    val name: String
    val Weight: Double
    val Age: Int
    var isMammal: Boolean

    init {
        this.Weight = if(Weight < 0) 0.1 else Weight
        this.Age = if(Age < 0) 0 else Age
        this.name = name
        this.isMammal = false
    }

    // Penggunaan Secondary Construktor
    constructor(name: String, Weight: Double, Age: Int, isMammal: Boolean) : this(name, Weight, Age){
        this.isMammal = isMammal
    }
}

fun main(){
    val cat = Animal("Miaw", 2.5, 4, true)
    println("name: ${cat.name}, Weight: ${cat.Weight}, Age: ${cat.Age}, Mamalia: ${cat.isMammal}")

    val bird = Animal("tweet", 0.5, 1)
    println("name: ${bird.name}, Weight: ${bird.Weight}, Age: ${bird.Age}, Mamalia: ${bird.isMammal}")
}*/
