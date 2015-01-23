object Currying extends App {

  def f(a: Int, b: Int): Int = a + b

  def f1(a: Int)(b: Int): Int = a + b

  override def main(args: Array[String]) {
    println(f(1, 2))
    println(f1(1)(2))
  }
}
