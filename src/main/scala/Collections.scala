object Collections extends App {
  override def main(args: Array[String]) = {
    def fruitList = List("apples", "oranges", "pears")
    def fruit = "apples" :: ("oranges" :: ("pears" :: Nil))

    println(fruitList)
    println(fruit)
    println(for (f <- fruitList) yield f)
    println(fruitList.head)
    println(fruitList.tail)
    println(fruit.head)
    println(fruit.tail)

    println(List())
    println(Nil)

    val nums = Vector("louis", "frank", "hiromi")
    println(nums(1))
    println(nums.updated(2, "helena"))

    val fruitSet = Set("apple", "banana", "pear", "banana")
    println(fruitSet.size)

    val r: Range = 1 until 5
    println(r)
    val s: Range = 1 to 5
    println(s)
    println(1 to 10 by 3)
    println(6 to 1 by -2)

    println(1 to 6)
    val t = (1 to 6).toSet
    println(t)
    println(t map (_ + 2))

    val u = "Hello World"
    println(u filter (c => c.isUpper))

    val xs = List("a", "b", "c", "d")
    val ys = List("e", "f")
    val zs = List("apple", "banana")
    println(xs.length)
    println(xs.last)
    println(xs.init)
    println(xs take 3)
    println(xs drop 3)
    println(xs(3))
    println(xs ++ ys)
    println(xs.reverse)
    println(xs.updated(3, "x"))
    println(xs indexOf "d")
    println(xs contains "d")
    println(xs filter (p => p == "d"))
    println(xs filterNot (p => p == "d"))
    println(xs partition (p => p == "c"))
    println(xs filter (p => p == "c"), xs filterNot (p => p == "c"))
    println(zs takeWhile (p => 1 == 1))

    println(List(1, 2, 3, 4, 5) reduceLeft (_ + _))
    val f = (x: Int, y: Int) => x + y
    println(List(1, 2, 3, 4, 5) reduceLeft (f))
    println(List(1, 2, 3, 4, 5) reduceLeft { (a, b) => a + b})

    println(List(1,2,3,4,5).foldLeft(5)(_ + _))
  }
}
