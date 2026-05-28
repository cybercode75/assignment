fun main() {
    var num = 12345
    var count = 0
    while (num != 0) {
        count++
        num /= 10
    }
    println(count)
}
