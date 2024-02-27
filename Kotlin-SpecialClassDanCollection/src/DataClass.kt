/*Data Class
* Data class adalah sebuah kelas yang tidak memiliki logika apapun dan juga tidak memiliki fungsionalitas lain selain menangani data.
* kompiler akan secara otomatis menghasilkan constructor, toString(), equals(), hashCode(), copy() dan juga fungsi componentN().*/
class User(val name: String, val age: Int){
    // bila tidak menggunakan DataClass
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as User

        if (name != other.name) return false
        if (age != other.age) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + age
        return result
    }
}
//Penerapan DataClass
data class DataUser(val name: String, val age: Int)

fun main(){
    // penerapan tanpa menggunakan dataClass
    val user = User("nrohmen", 17)
    val user2 = User("nrohmen", 17)
    val user3 = User("dimas", 24)
    // penerapan fungsi equals() pada DataClass
    val datauser = DataUser("nrohmen", 17)
    val dataUser2 = DataUser("nrohmen", 17)
    val dataUser3 = DataUser("dimas", 24)
    // penerapan fungsi copy() pada DataClass
    val dataUser4 = dataUser2.copy("bale", 21)
    /*Destructuring Declarration
    * proses memetakan objek menjadi sebuah variabel. Ini bisa dengan mudah kita lakukan pada data class.*/
    // penerapan fungsi componentN()
    val age = dataUser4.component2()
    val name = dataUser4.component1()
    // penerapan objek secara langsung
    val (name, age) = datauser
    println("nama saya $name, umur saya $age")

    println(user)
    println(datauser)
    println(dataUser4)

    println(datauser.equals(dataUser2))
    println(datauser.equals(dataUser3))

    println(user.equals(user2))
    println(user.equals(user3))
}