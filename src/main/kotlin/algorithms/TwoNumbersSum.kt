
fun main(args: Array<String>) {
    val arrNums = arrayOf(1,2,3, 4)
    val result = twoNumbers(arrNums, 6)
    println(result)

    println(twoNumbersOneLoop(arrNums, 6))
}

fun twoNumbersOneLoop(numbers: Array<Int>, target: Int): Pair<Int, Int> {
    // [1,2,3,4] 6
    // [5,4,3,2]
    // [0,1,2,3] = [1,3]

    val map: MutableMap<Int, Int> = mutableMapOf()
    for (i in 0 until numbers.size) {
        val numKey = numbers[i]
        val findNum = map.get(target - numKey)
        if(findNum != null){
            return Pair(findNum, i)
        }
        map.put(numKey, i)
    }
    throw Exception("Error")
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    val map: MutableMap<Int, Int> = mutableMapOf()
    var result: IntArray = intArrayOf()
    for (i in 0 until nums.size) {
        val numKey = nums[i]
        val findNum = map.get(target - numKey)
        if(findNum != null){
            result = intArrayOf(findNum, i)
        }
        map.put(numKey, i)
    }
    return result
}

fun twoNumbers(numbers: Array<Int>, target: Int): Pair<Int, Int> {
    // [1,2,3,4] 6
    // [5,4,3,2]
    // [0,1,2,3] = [1,3]

    val map: MutableMap<Int, Int> = mutableMapOf()
    for (i in 0 until numbers.size) {
        val numKey = numbers[i]
        map.put(numKey, i)
    }
    for (i in 0 until numbers.size) {
        val numLook = numbers[i]
        val findNum = map.get(target - numLook)
        if(findNum != null){
            return Pair(i   , findNum)
        }
    }
    throw Exception("Error")
}