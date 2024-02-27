/*EnumClass
* merupakan salah satu fitur yang bisa kita gunakan untuk menyimpan kumpulan objek yang telah didefinisikan menjadi tipe data konstanta.
* Enumeration dapat ditetapkan sebagai nilai ke dalam sebuah variabel dengan cara yang lebih efisien. */

fun main() {
    val color: Color = Color.valueOf("BLUE")
    println("Color is $color")
    println("Color value is ${color.value.toString(16)}")
}


enum class Color(val value: Int) {
    RED(0xFF0000){
        override fun printValue() {
            println("value of RED is $value")
        }
    },
    GREEN(0x00FF00){
        override fun printValue() {
            println("value of GREEN is $value")
        }
    },
    BLUE(0x0000FF){
        override fun printValue() {
            println("value of BLUE is $value")
        }
    };

    abstract fun printValue()
}