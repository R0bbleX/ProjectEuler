package projectEuler

//If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
//The sum of these multiples is 23.
//Find the sum of all the multiples of 3 or 5 below 1000.

object Multiples3And5 extends App {
  def sumMultiplesOfThreeAndFive (upperLimit: Int): Int = {
    (1 until upperLimit).filter(n => n % 3 == 0 || n % 5 == 0).sum
  }
  println(sumMultiplesOfThreeAndFive(1000))
}
