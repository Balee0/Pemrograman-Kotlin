// run fungsi akan mengembalikan nilai berdasarkan expression yang berada di dalam blok lambda.
fun main() {
    val text = "Hello"
    val result = text.run {
        val from = this
        val to = this.replace("Hello", "Kotlin")
        "replace text from $from to $to"
    }
    println("result : $result")
}

/*
   output : result : replace text from Hello to Kotlin
*/

// with
fun main() {
    val message = "Hello Kotlin!"
    val result = with(message) {
        "First character is ${this[0]}" +
                " and last character is ${this[this.length - 1]}"
    }

    println(result)
}

/*
   output : First character is H and last character is !
*/

// Apply adalah nilai dari konteks objeknya dan objek konteksnya tersedia sebagai receiver (this).
fun main() {
    val message = StringBuilder().apply {
        append("Hello ")
        append("Kotlin!")
    }

    println(message.toString())
}

/*
   output : Hello Kotlin
*/