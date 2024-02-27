
class House(){
    // Properti outher class
    val buildingArea = 100

    // untuk bisa memanggil properti outher class di butukahkan class inner
    inner class Room(){
        val totalRoom = 4
        fun measurRoomArea(){
            println(buildingArea/totalRoom)
        }
    }
}

fun main(){
    val house = House()
    val room = house.Room()
    room.measurRoomArea()
}