/*Primary Constructor
* jika akan membuat suatu objek dari sebuah kelas dan kelas tersebut memiliki primary constructor di dalamnya,
* kita harus mengirim nilai sesuai properti yang dibutuhkan.
* Penulisan primary constructor mirip seperti parameter pada fungsi.
* Properti cukup dituliskan pada header class diawali dengan var atau val.*/

/*
fun main(){
    val cat = Animal("Miaw", 4.2, 2, true)
    println("Nama: ${cat.name}, Berat: ${cat.weight}, Umur: ${cat.age}, Mamalia: ${cat.isMammal}")
}
// Primary
// class Animal(val name:String,val weight:Double,val age:Int,val isMammal: Boolean)

// Init Block yang memungkinkan kita untuk menuliskan properti di dalam body class ketika kita menggunakan primary constructor.
class Animal(name:String, weight:Double, age:Int, isMammal: Boolean){
    val name: String
    val weight: Double
    val age: Int
    val isMammal: Boolean

    // Untuk menghindari ambiguitas kita dapat menggunakan keyword this dalam menginisialisasi properti tersebut dalam blok init.
    init {
        this.weight = if(weight < 0) 0.1 else weight
        this.age = if(age < 0) 0  else age
        this.name = name
        this.isMammal = isMammal
    }
}

*/
