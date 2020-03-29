package subtask2

class MiniMaxSum {
    fun getResult(input: IntArray): IntArray {
        val min = input.min();
        val max = input.max()
        var minOut = 0
        var maxOut = 0
        for(e in input) {
            if(e != max) minOut += e
            if( e != min) maxOut += e
        }
        return intArrayOf(minOut,maxOut)
    }
}
