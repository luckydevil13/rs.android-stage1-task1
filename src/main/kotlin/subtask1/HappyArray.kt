package subtask1

class HappyArray {
    fun convertToHappy(sadArray: IntArray): IntArray {
        var happyList = sadArray.toMutableList();
        var temp: MutableList<Int> = this.makeItHappy(happyList);

        while(happyList != temp) {
            happyList = temp
            temp = this.makeItHappy(happyList);
        }

        return happyList.toIntArray()
    }

    fun makeItHappy(notHappyArray: MutableList<Int>): MutableList<Int> {
        var temp: MutableList<Int> = mutableListOf();

        for (i in 0..notHappyArray.size - 1) {
            if (i == 0 || i == notHappyArray.size - 1 || (notHappyArray[i - 1] + notHappyArray[i + 1]) > notHappyArray[i]) {
                temp.add(notHappyArray[i])
            }
        }

        return temp;
    }
}