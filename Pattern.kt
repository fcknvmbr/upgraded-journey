
class Pattern(private val matrix: Array<IntArray>) {
    
    fun bypass(): String {
        
        val size = matrix.size

        val circleBypassCount = size / 2

        val sb = StringBuilder()

        sb.append("${matrix[circleBypassCount][circleBypassCount]} ")

        (1..circleBypassCount).forEach { stepIndex ->

            for (i in (circleBypassCount - stepIndex + 1)..(circleBypassCount + stepIndex)) {
                sb.append("${matrix[i][circleBypassCount - stepIndex]} ")
            }

            for (i in (circleBypassCount - stepIndex + 1)..(circleBypassCount + stepIndex)) {
                sb.append("${matrix[circleBypassCount + stepIndex][i]} ")
            }

            for (i in (circleBypassCount + stepIndex - 1)downTo(circleBypassCount - stepIndex)) {
                sb.append("${matrix[i][circleBypassCount + stepIndex]} ")
            }

            for (i in (circleBypassCount + stepIndex - 1)downTo(circleBypassCount - stepIndex)) {
                sb.append("${matrix[circleBypassCount - stepIndex][i]} ")
            }

        }

        return sb.toString()
    }
    
}