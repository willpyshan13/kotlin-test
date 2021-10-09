fun main() {
    plusOne(intArrayOf(1,2,3))
}
fun plusOne(digits: IntArray): IntArray {
    println("digits[i]=${digits[0]}   digits.size -1=${digits.size -1}")
    for (i in digits.size -1 downTo 0){
        digits[i]++
        if (digits[i] == 10) digits[i] = 0
        else return digits
    }
    val after = digits.toMutableList()
    after.add(0,1)
    return after.toIntArray()
}
