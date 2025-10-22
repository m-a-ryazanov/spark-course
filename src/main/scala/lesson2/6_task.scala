import scala.io.StdIn

def joinStrings(strings: List[String]): String = {
  strings.mkString(" ")
}

object Main6 extends App {
  println("Введите три строки:")

  val inputs = for {
    _ <- 1 to 3
  } yield StdIn.readLine()

  val result = joinStrings(inputs.toList)

  println(result)
}