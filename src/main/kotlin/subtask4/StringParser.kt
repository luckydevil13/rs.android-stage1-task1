package subtask4

class StringParser {

    fun getResult(inputString: String): Array<String> {
        val startChars = "([<"
        val stopChars = ")]>"
        var result = arrayOf<String>()

        inputString.forEachIndexed { index, c ->
            var startIndex: Int;
            var stopIndex: Int;
            if (c in startChars) {
                var startChar: Char = c
                var stopChar: Char = stopChars[startChars.indexOf(startChar)]
                startIndex = index + 1
                stopIndex = startIndex
                var errorStopChar: Int = 0

                for (i in startIndex until inputString.length) {
                    if (inputString[i] == startChar) {
                        errorStopChar += 1
                        continue
                    } else if (inputString[i] == stopChar) {
                        if (errorStopChar > 0) {
                            errorStopChar -= 1
                            continue
                        }
                        stopIndex = i
                        break
                    }
                }
                val sting  = inputString.substring(startIndex, stopIndex)
                result += sting
            }
        }
        return result
    }
}
