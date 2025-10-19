import scala.io.StdIn

println("Введите число:")
val number = StdIn.readLine().toInt

val result = if (number % 2 == 0) "Четное" else "Нечетное"

println(result)