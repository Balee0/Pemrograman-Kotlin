package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

// main function dari kotlin
fun main() {
    val name = "Iqbal"

    println("hai nama saya $name")
//    println(name)

// Data tipe & variabel
    // var identifier: type = initialization

    // var adalah variabel yang dimana bisa di ubah nilai yang sudah di inisiasikan
    var User: String = "Indonesia"
    User = "Indonesia Maju"
    println(User)

    // Berbeda dengan val yang dimana tidak bisa mengubah nilai yang telah di inisiasikan
    val user: String = "Indonesia"
//    user = "Idonesia Berkembang" bila dijalankan akan eror
    println(user)

//    contoh penggunaan variabel
    val firstWord = "Hallo"
    val LastWord = "Dunia"
    println(firstWord + LastWord)

    val valueA: Int = 10
    val valueB = 20
    print(valueA + valueB)

}