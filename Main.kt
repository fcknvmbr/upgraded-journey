import java.util.*

object Main {

    @JvmStatic fun main(args: Array<String>) {

        val random = Random()

        val n: Int = if (args.isNotEmpty()) {
            args[0].toInt()
        } else {
            5
        }

        val maxValue = 10
        val size = n * 2 - 1

        val matrix = Array(size) {IntArray(size)}

        for (i in 0 until size) {
            for (j in 0 until size) {
                matrix[i][j] = random.nextInt(maxValue)
                print("${matrix[i][j]} ")
            }
            println()
        }

        val pattern = Pattern(matrix)

        println()
        println(pattern.bypass())

    }

}