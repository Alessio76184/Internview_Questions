// Write a function BracketCombinations(num: Int): Int that returns the number of valid bracket (parentheses) combinations using num pairs.
// Example Results: BracketCombinations(3) ➞ 5
// BracketCombinations(4) ➞ 14

fun BracketCombinations(num: Int): Int {
    var fact2n = 1L
    var factn = 1L
    var factnPlus1 = 1L

    for (i in 1..2 * num) {
        fact2n *= i.toLong()
        if (i == num) factn = fact2n
        if (i == num + 1) factnPlus1 = fact2n
    }

    val result = fact2n / (factn * factnPlus1)
    return result.toInt()
}
