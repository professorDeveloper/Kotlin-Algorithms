package pdpMasala6

class Fibonacci  {
     fun fibonacci(n: Int): Int {
        return if (n == 0) {
            0
        } else if (n == 1) {
            1
        } else if (n > 1) {
            fibonacci(n - 1) + fibonacci(n - 2)
        } else {
            0
        }
    }


}