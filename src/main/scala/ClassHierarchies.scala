object ClassHierarchies extends App {

  abstract class TopLevel {
    def method1(x: Int): Int

    def method2(x: Int): Int = x
  }

  class Level1 extends TopLevel {
    def method1(x: Int): Int = x

    override def method2(x: Int): Int = x
  }

  object MyObject extends TopLevel {
    def method1(x: Int): Int = x
  }

  override def main(args: Array[String]) = {
    println(new Level1().method1(1))
    println(new Level1().method2(2))
    println(MyObject.method1(1))
    println(MyObject.method2(2))
  }
}
