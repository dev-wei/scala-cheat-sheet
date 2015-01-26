trait Similar {
  def isSimilar(x: Any): Boolean
}
case class MyInt(x: Int) extends Similar {
  def isSimilar(m: Any): Boolean =
    m.isInstanceOf[MyInt] &&
      m.asInstanceOf[MyInt].x == x
}
object UpperTypeBounds extends App {
  def findSimilar[T <: Similar](e: T, xs: List[T]): Boolean =
    if (xs.isEmpty) false
    else if (e.isSimilar(xs.head)) true
    else findSimilar[T](e, xs.tail)
  val list: List[MyInt] = List(MyInt(1), MyInt(2), MyInt(3))
  println(list.head)
  println(list.tail)
  println(list.tail.head)
  println(list.tail.tail)
  println(findSimilar[MyInt](MyInt(4), list))
  println(findSimilar[MyInt](MyInt(2), list))
}

