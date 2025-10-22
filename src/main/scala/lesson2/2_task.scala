import scala.io.StdIn

object Main2 extends App {
  println("Введите первое число:")
  val input1 = StdIn.readLine()

  println("Введите второе число:")
  val input2 = StdIn.readLine()

  def sumNumbers(num1: Int, num2: Int): Int = {
    num1 + num2
  }

  val sum = sumNumbers(input1.toInt, input2.toInt)

  println(s"Сумма: $sum")
}