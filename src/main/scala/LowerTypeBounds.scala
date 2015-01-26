case class ListNode[+T](h: T, t: ListNode[T]) {
  def head: T = h
  def tail: ListNode[T] = t
  def prepend[U >: T](elem: U): ListNode[U] =
    ListNode(elem, this)
}

object LowerTypeBounds extends App {
  val list = ListNode(2, null)
  val list2 = list.prepend("a").prepend("b")
  val list3 = list2.prepend(12345)

  println(list3)
}
