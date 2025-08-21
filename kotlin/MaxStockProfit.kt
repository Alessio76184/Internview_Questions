// Given an array of stock prices, return the maximum profit from a single buy and sell. If no profit is possible, return 0.
//Example results: CodingChallenge(arrayOf(7, 1, 5, 3, 6, 4)) ➞ 5
//Example results: CodingChallenge(arrayOf(7, 6, 4, 3, 1)) ➞ 0

fun CodingChallenge(arr: Array<Int>): Int {
    var minPrice = Int.MAX_VALUE
    var maxProfit = 0

    for (price in arr) {
        // Track the lowest price seen so far
        if (price < minPrice) {
            minPrice = price
        }
        // Calculate profit if we sold today
        else if (price - minPrice > maxProfit) {
            maxProfit = price - minPrice
        }
    }

    return maxProfit
}
