/*
package org.example

import kotlin.reflect.KProperty
*/
/*Pengelolaan properti kelas baik itu memberikan atau merubah sebuah nilai dapat didelegasikan kepada kelas lain.
* Dengan ini kita dapat meminimalisir boilerplate dalam penulisan getter dan setter (jika properties menggunakan var) pada setiap kelas yang kita buat.  *//*

fun main(){
    val animal = Hewan()
    animal.name ="Miaw"
    println("nama hewan: ${animal.name}")

    val person = Person()
    person.name = "bolt"
    println("nama orang: ${person.name}")

    val hero = Hero()
    hero.name = "sakti"
    println("nama pahlawan: ${hero.name}")
}

class DelegateName {
    private var value: String = "Default"

    operator fun getValue(classRef: Any?, property: KProperty<*>): String {
        println("Fungsi ini sama seperti getter untuk property ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: String){
        println("Fungsi ini sama seperti setter untuk properti ${property.name} pada class $classRef")
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
}

class Hewan(){
    var name: String by DelegateName()
}
class Person(){
    var name: String by DelegateName()
}
class Hero(){
    var name: String by DelegateName()
}
*/
