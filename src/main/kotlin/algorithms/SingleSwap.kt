package algorithms

class SingleSwap {

    fun areAlmostEqual(s1: String, s2: String): Boolean {
        if(s1 == s2) return true
        if(s1.length != s2.length) return false

        val arr1 = s1.toCharArray()
        val arr2 = s2.toCharArray()

        var pair1: Pair<Char, Char>? = null
        var pair2: Pair<Char, Char>? = null
        for (i in arr1.indices) {
            if (arr1[i] != arr2[i]) {
                if (pair1 == null) {
                    pair1 = Pair(arr1[i], arr2[i])
                } else if (pair2 == null) {
                    pair2 = Pair(arr1[i], arr2[i])
                } else {
                    return false
                }
            }
        }

        return (pair1?.first == pair2?.second
                && pair1?.second == pair2?.first)


    }
}