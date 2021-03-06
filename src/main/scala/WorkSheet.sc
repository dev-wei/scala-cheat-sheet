def insertionSort[A <% Ordered[A]](list: List[A]): List[A] =
  list.foldLeft(List[A]()) { (r,c) =>
    val (front, back) = r.span(_ < c)
    front ::: c :: back
  }