object HigherOrderFunctions extends App {
  def sum(f: Int => Int): (Int, Int) => Int = {
    def sumf(a: Int, b: Int): Int = {
      return f(a + b)
    }
    sumf
  }

  def sumThree(f: Int => Int)(a: Int, b: Int): Int = f(a + b)

  def cube(x: Int) = x * x * x

  override def main(args: Array[String]) {
    println(sum(x => x * x * x)(1, 1))
    println(sum(cube)(1, 1))

    println(sumThree(x => x * x * x)(1, 1))
    println(sumThree(cube)(1, 1))
  }
}
