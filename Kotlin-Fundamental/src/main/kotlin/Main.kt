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

    // If expression akan mengeksekusi sebuah statement atau expression jika hasil evaluasi dari expressions yang diberikan pada blok if bernilai true. Sebaliknya, jika bernilai false maka proses yang ditentukan akan dilewatkan.
    val openHours = 7
    val now = 1
    val office: String
    office = if (now > 7){
        "Office already open"
    }else if (now == openHours){
        "Wait a minute, Office already open"
    }else {
        "office is closed"
    }
    println(office)

    // Boolean adalah sebuah tipe data yang hanya memiliki dua nilai, yaitu true dan false. Terdapat 3 (tiga) operator yang dapat digunakan pada Boolean.
    // Operator AND && kedua nilai harus true agar bisa terpenuhi
    val officeOpen = 7
    val officeClosed = 16
    val sekarang = 1

    val isOpen = if (sekarang >= officeOpen && sekarang <= officeClosed){
        true
    } else {
        false
    }

    println("Office is open : $isOpen")

    // Operator OR || terpenuhi jika salah satu nilai bernilai true
    val isClose = if (sekarang <= officeOpen || sekarang >= officeClosed){
        true
    }else{
        false
    }

        println("Office is closed : $isClose")

    // Operator NOT ! Jika hasil expressions setelah dievaluasi bernilai true, operator NOT akan mengembalikan nilai false.
    if (!isOpen) {
        print("Office is closed")
    } else {
        print("Office is open")
    }


}