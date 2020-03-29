package subtask5

class HighestPalindrome {

    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {
        val half = n / 2
        var leftSide = digitString.take(half)
        var rightSide = digitString.takeLast(half)
        var errorDigitCount: Int = 0
        for (i in 0 until half) {
            if (leftSide[i] != rightSide[half - i - 1]) {
                errorDigitCount += 1
            }
        }

        if (errorDigitCount > k) {
            return "-1"
        }

        if ((k - errorDigitCount) > 0)
            for (i in 0 until (k - errorDigitCount)) {
                leftSide = leftSide.replaceRange(i, i + 1, "9")
            }

        val palindromOne = digitString.replaceRange(0, half, rightSide.reversed())
            .replaceRange(digitString.length - half, digitString.length, rightSide)
        val palindromTwo = digitString.replaceRange(
            digitString.length - half,
            digitString.length,
            leftSide.reversed()
        ).replaceRange(0, half, leftSide)

        if (palindromOne.toInt() > palindromTwo.toInt()) {
            return palindromOne
        } else {
            return palindromTwo
        }
    }
}
