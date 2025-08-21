// Given an array of strings, return the longest common prefix. If no prefix is shared, return an empty string "".
// Input: arrayOf("cranberry", "crawfish", "crap") Output: "cra

fun CodingChallenge(strArr: Array<String>): String {
    if (strArr.isEmpty()) return ""

    var prefix = strArr[0]

    for (i in 1 until strArr.size) {
        val current = strArr[i]
        var j = 0
        while (j < prefix.length && j < current.length && prefix[j] == current[j]) {
            j++
        }
        prefix = prefix.substring(0, j)
        if (prefix.isEmpty()) return ""
    }

    return prefix
}
