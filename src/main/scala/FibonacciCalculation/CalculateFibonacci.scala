package FibonacciCalculation

import scala.annotation.tailrec
import scala.util.{Try, Failure, Success}

object CalculateFibonacci {

  /**
   * Calculates the nth Fibonacci number.
   *
   * @param position the position of the Fibonacci number to calculate (must be non-negative).
   * @return the calculated Fibonacci number wrapped in a Try, or a Failure if the position is negative.
   */
  def nthFibonacciNumber(position: Int): Try[Int] = {
    // Check for negative position and return Failure with an error message if found
    if (position < 0) {
      Failure(new IllegalArgumentException("Position must be a non-negative integer"))
    } else {
      // Tail-recursive Fibonacci calculation
      @tailrec
      def fibonacci(currentPosition: Int, previousNumber: Int, currentNumber: Int): Int = currentPosition match {
        // Base case: return previous number when position is 0
        case 0 => previousNumber
        // Base case: return current number when position is 1
        case 1 => currentNumber
        // Recursive case: calculate the next Fibonacci number
        case _ => fibonacci(currentPosition - 1, currentNumber, previousNumber + currentNumber)
      }
      Success(fibonacci(position, 0, 1)) // Return the result wrapped in a Success
    }
  }
}
