import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers._
import FibonacciCalculation.CalculateFibonacci

class FibonacciCalculationTest extends AnyFunSuite {

  test("Return Failure for negative position") {
    val result = CalculateFibonacci.nthFibonacciNumber(-1)
    result.isSuccess shouldBe false
    result.isFailure shouldBe true
  }

  test("Return 0 for position 0") {
    CalculateFibonacci.nthFibonacciNumber(0).get shouldBe 0
  }

  test("Return 1 for position 1") {
    CalculateFibonacci.nthFibonacciNumber(1).get shouldBe 1
  }

  test("Return the correct Fibonacci number for a given position") {
    CalculateFibonacci.nthFibonacciNumber(2).get shouldBe 1
    CalculateFibonacci.nthFibonacciNumber(3).get shouldBe 2
    CalculateFibonacci.nthFibonacciNumber(4).get shouldBe 3
    CalculateFibonacci.nthFibonacciNumber(5).get shouldBe 5
    CalculateFibonacci.nthFibonacciNumber(6).get shouldBe 8
    CalculateFibonacci.nthFibonacciNumber(7).get shouldBe 13
    CalculateFibonacci.nthFibonacciNumber(8).get shouldBe 21
    CalculateFibonacci.nthFibonacciNumber(9).get shouldBe 34
    CalculateFibonacci.nthFibonacciNumber(10).get shouldBe 55
  }
}
