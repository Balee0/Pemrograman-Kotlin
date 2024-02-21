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
    println(valueA + valueB)

    // Char Untuk mendefinisikan sebuah variabel dengan tipe data Char kita bisa menggunakan tanda kutip tunggal (' ')
    val character = 'A'

    var vocal = 'A'
    println("Vocal " + vocal++)
    println("Vocal " + vocal++)
    println("Vocal " + vocal++)
    println("Vocal " + vocal--)
    println("Vocal " + vocal--)
    println("Vocal " + vocal--)
    println("Vocal " + vocal--)

    // String Untung menyipan nilai berupa teks
    val textString  = "Kotlin"

    // penggunaan string pada indexing
    val text  = "Dicoding"
    val firstChar = text[4]
    println("The 4th character of the $text is $firstChar")

    // Sting Tamplate Sebuah fitur yang memungkinkan kita untuk menyisipkan sebuah variabel ke dalam sebuah String tanpa concatenation (penggabungan objek String menggunakan +)
    val nam = "Kotlin"
    println("My name is $nam")


}