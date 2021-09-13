class ProblemD {
    fun main() {
        val t = readInt()
        for (runs in 1..t) {
            val n = readInt()
            val arr = readLongArray(n)
            arr.sortDescending()
            var max = 0L
            for (j in 0 until n) {
                if (arr[j] + arr[j] * j > max)
                    max = arr[j] + arr[j] * j
            }
            println(max)
        }
    }
}