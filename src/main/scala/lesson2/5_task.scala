import scala.io.StdIn

object Main5 extends App {
  println("Введите строку:")
  val str = StdIn.readLine()

  val size = str.size
  println(s"Длина строки: $size")
}