package lesson4

object Task7 extends App {
  var list = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

  var squareList =
    for value <- list
      yield value * value

  var evenList =
    for value <- list if value % 2 == 0
      yield value

  println(s"Оригинал: ${list.toString()}")
  println(s"Квадраты: ${squareList.toString()}")
  println(s"Четный список: ${evenList.toString()}")
}

