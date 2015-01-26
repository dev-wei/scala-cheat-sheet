class MyBool(x: Boolean) {
  def and(that: MyBool): MyBool = if (x) that else this
  def or(that: MyBool): MyBool = if (x) this else that
  def negate: MyBool = new MyBool(!x)
}



object Operators extends App {
  def not(x: MyBool) = x negate; // semicolon required here
  def xor(x: MyBool, y: MyBool) = (x or y) and not(x and y)

}
