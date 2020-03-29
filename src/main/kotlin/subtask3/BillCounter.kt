package subtask3

class BillCounter {
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        var delta = 0
        var total = 0

        for(index in 0..bill.size - 1) {
            if(index !== k) {
                delta += bill[index]
            }
            total += bill[index]
        }
        if (delta/2 == b) {
            return "Bon Appetit";
        } else {
            return (b - delta / 2).toString()
        }
    }
}
