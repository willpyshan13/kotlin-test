class NumberToWords {
    companion object {
        var singles = arrayOf("", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine")
        var teens = arrayOf(
            "Ten",
            "Eleven",
            "Twelve",
            "Thirteen",
            "Fourteen",
            "Fifteen",
            "Sixteen",
            "Seventeen",
            "Eighteen",
            "Nineteen"
        )
        var tens = arrayOf("", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety")
        var thousands = arrayOf("", "Thousand", "Million", "Billion")
        fun numberToWords(num: Int): String {
            var num = num
            if (num == 0) {
                return "Zero"
            }
            val sb = StringBuffer()
            var i = 3
            var unit = 1000000000
            while (i >= 0) {
                val curNum = num / unit
                if (curNum != 0) {
                    num -= curNum * unit
                    val curr = StringBuffer()
                    recursion(curr, curNum)
                    curr.append(thousands[i]).append(" ")
                    sb.append(curr)
                }
                i--
                unit /= 1000
            }
            return sb.toString().trim { it <= ' ' }
        }

        private fun recursion(curr: StringBuffer, num: Int) {
            when {
                num == 0 -> {
                    return
                }
                num < 10 -> {
                    curr.append(singles[num]).append(" ")
                }
                num < 20 -> {
                    curr.append(teens[num - 10]).append(" ")
                }
                num < 100 -> {
                    curr.append(tens[num / 10]).append(" ")
                    recursion(curr, num % 10)
                }
                else -> {
                    curr.append(singles[num / 100]).append(" Hundred ")
                    recursion(curr, num % 100)
                }
            }
        }
    }
}

