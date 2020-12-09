/* 
    Given a 32-bit signed integer, reverse digits of an integer.
*/

object Solution {
    def reverse(x: Int): Int = {
        var num = x
        var reverse = 0

        while (num != 0) {
            var lastDigit = num % 10
            num = num / 10

            if (reverse > Int.MaxValue / 10 || (reverse == Int.MaxValue && lastDigit > 7)) {
                return 0
            }

            if (reverse < Int.MinValue / 10 || (reverse == Int.MinValue && lastDigit < -8)) {
                return 0
            }

            reverse = (reverse * 10) + lastDigit 

            // println(s"lastDigit: $lastDigit, num: $num, reverse: $reverse")
        }
        
        return reverse
    }

    def main(args: Array[String]): Unit ={
        // val x = -1204566149
        val x = 120456619
        println(reverse(x))
    }
}