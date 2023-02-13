package algorithms

class SmallestPositiveInteger {

    fun findMissingValue(values: Array<Int>): Int {

        val maxVal = values.maxOrNull() ?: 0
        var missed = maxVal + 1
        for (i in 1..maxVal) {
            if (i !in values) {
                missed = i
            }
        }
        return missed
    }

    fun findMissingValueFaster(values: Array<Int>): Int {

        var max = values[0]
        var i = 1
        while(i < values.size) {
            if(values[i] > max) {
                max = values[i]
            }

            if (i == values[i])
            i++
        }
        return 0
    }

}