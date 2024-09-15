fun main() {
    var value = 1
    println("Enter the Number:")
    val yourNum = readln().toInt()
    while (value<=10){
        val result = yourNum * value
        println("$yourNum * $value = $result")
        value++
    }
}