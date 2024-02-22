/*Visibility Modifiers*/

// Private Ketika suatu anggota memiliki hak akses private, maka anggota tersebut tidak dapat diakses dari luar scope-nya.
/*
class Animal(private var name:String, private var weight: Double, private var age: Int, private var isMammal: Boolean){
    // cara untuk mengakses properti private dari sebuah kelas adalah dengan menambahkan fungsi getter dan setter secara manual.
    fun getName(): String{
        return name
    }
    fun  setName(newName: String){
        name = newName
    }
}

fun main(){
    val cat = Animal("Brow", 2.1, 2, true)
    println(cat.getName())
    cat.setName("Sis")
    println(cat.getName())
}*/
