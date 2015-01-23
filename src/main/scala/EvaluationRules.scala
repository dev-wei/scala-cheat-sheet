object EvaluationRules extends App {
  def one = 2

  val two = 3

  lazy val three = 2

  def something() = {
    println("Calling something")
    1 // return value
  }

  def callByValue(x: Double) = {
    println("x1=" + x)
    println("x2=" + x)
  }

  def callByName(x: => Double) = {
    println("x1=" + x)
    println("x2=" + x)
  }

  def myFct(bindings: Int*) = {
    for (binding <- bindings)
      println(binding)
  }

  override def main(args: Array[String]) {
    println(one)
    println(two)
    callByValue(something())
    callByName(something())
    myFct(1, 2, 3, 4)
  }
}
