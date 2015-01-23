object HigherOrderFunctions extends App {
  def sumOne(f: Int => Int): (Int, Int) => Int = {
    def sumTwo(a: Int, b: Int): Int = {
      return a
    }
    sumTwo
  }

  def sumThree(f: Int => Int)(a: Int, b: Int): Int = {
    return 1
  }

  override def main(args: Array[String]) {
    println("Hello, world!")
  }
}
