fun main() {
    var num = 121
    var temp = num
    var rev = 0
    while (temp != 0) {
        val digit = temp % 10
        rev = rev * 10 + digit
        temp /= 10
    }
    if (num == rev) println("Palindrome") else println("Not Palindrome")
}
