fun main(){
    val AnyList = listOf('a', "huruf", 12)
    println(AnyList)
    println(AnyList[2])

    // mutable melakukan perubahan pada nilainya dengan cara seperti menambah, menghapus, atau mengganti nilai yang sudah ada.
    val anyList = mutableListOf('a', "Kotlin", 3, true, User())
    anyList.add('d') // menambah item di akhir list
    anyList.add(1, "love") // menambah item pada indeks ke-1
    anyList[3] = false // mengubah nilai item pada indeks ke-3
    anyList.removeAt(0) // menghapus item pada indeks ke-0

}
class User{

}
