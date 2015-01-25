object Classes extends App {

  class MyClass(x: Int, y: Int) {
    require(y > 0, "y must be positive")

    def this(x: Int) = {
      this(x, 1)
      nb1 = x
    }

    var nb1 = x
    var nb2 = y

    private def test(a: Int): Int = a

    val nb3 = x + y

    override def toString = nb1 + "-" + nb2
  }

  override def main(args: Array[String]) = {
    println(new MyClass(1, 2))
    println(new MyClass(1))
  }
}
