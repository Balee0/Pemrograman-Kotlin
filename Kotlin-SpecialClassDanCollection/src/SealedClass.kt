sealed class Result {
    sealed class Succes(val data: Any) : Result()
    data class Error(val message: String) : Result()
    object Loading : Result()

}

fun main(){
    val result: Result = Result.Error("Oops!")
    when (result){
        is Result.Succes -> {
            println("Succes: ${result.data}")
        }
        is Result.Error -> {
            println("Error: ${result.message}")
        }
        is Result.Loading ->{
            println("Loading....")
        }
    }
}