package lesson4

import scala.io.StdIn

object Task6 extends App {
  println("Введите имя:")
  var name = StdIn.readLine()
  println("Введите возраст:")
  var age = StdIn.readInt()
  println("Введите ваш статус (Студент/Не студент):")
  var status = StdIn.readLine()
  var agePeriod = agePeriodByAge(age)

  println(s"Вы: ${name}\nВозраст: ${age}\nКатегория: ${agePeriod}\nСтатус: ${status}")
}

