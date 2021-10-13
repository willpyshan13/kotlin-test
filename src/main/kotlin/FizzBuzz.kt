class FizzBuzz {
    fun fizzBuzz(n: Int): List<String> {
        val fizzBuzzList = mutableListOf<String>()
        for (i in 1 until n){
            var temp = ""
            if (i %3 ==0){
                temp += "Fizz"
            }
            if (i %5 ==0){
                temp += "Buzz"
            }
            if ( i %3 != 0 && i %5 !=0) {
                temp += i
            }
            fizzBuzzList.add(temp)
        }
        return fizzBuzzList
    }
}
