import scala.io.StdIn

object Main4 extends App {
  println("Введите число:")
  val number = StdIn.readLine().toInt

  val result = if (number % 2 == 0) "Четное" else "Нечетное"

  println(result)
}