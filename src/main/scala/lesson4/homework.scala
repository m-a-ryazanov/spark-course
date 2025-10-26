package lesson4

object Homework extends App {
  //task 1
  var intVar: Int = 10
  var doubleVar: Double = 15.7
  var strVar: String = "Hello"
  var boolVar: Boolean = true

  //task 2
  println(intVar)
  println(doubleVar)
  println(strVar)
  println(boolVar)

  //task 3
  println(sumTwoVar(17, 3))

  //task 4
  println(agePeriodByAge(11))
  println(agePeriodByAge(47))

  //task 5
  var rangeList = Range(1,10)
  rangeList.foreach(x => print(x + " "))
  println()

  //task 5.1
  var studentsList = List("Mikhail", "Lubov", "Viktor", "Maksim", "Vladimir", "Sveta")
  studentsList.foreach(student => print(student + " "))
}

//task 3
def sumTwoVar(x: Int, y: Int): Int = {
  x + y
}

//task 4
def agePeriodByAge(age: Int): String = {
  if (age < 30) "Молодой" else "Взрослый"
}