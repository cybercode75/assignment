fun main() {
    var num = 1234
    var rev = 0
    while (num != 0) {
        val digit = num % 10
        rev = rev * 10 + digit
        num /= 10
    }
    println(rev)
}
