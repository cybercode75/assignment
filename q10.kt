fun checkChar(ch: Char) {
    if (ch in listOf('a','e','i','o','u','A','E','I','O','U')) {
        println("Vowel")
    } else {
        println("Consonant")
    }
}

fun main() {
    checkChar('a')
}
