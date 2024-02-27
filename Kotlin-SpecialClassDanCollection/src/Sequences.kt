/*Dengan sequence, operasi akan dilakukan secara vertikal atau per item, misalnya dimulai angka 1.
Karena tidak memenuhi kondisi pada filter, operasi tidak akan dilanjutkan ke map().*/
fun main(){
    val list = (1..10000).toList()
    val number = list.asSequence().filter { it % 5 == 0 }.map { it * 2 }.first()
    println(number)
}