trait Cloneable extends java.lang.Cloneable {
  override def clone(): Cloneable = {
    super.clone().asInstanceOf[Cloneable]
  }
}

trait Resetable {
  def reset: Unit
}

class CompoundType extends Cloneable with Resetable {
  def reset: Unit = return 100
}

object CompoundTypes extends App {
  def cloneAndReset(obj: Cloneable with Resetable): Cloneable = {
    val cloned = obj.clone()
    obj.reset
    cloned
  }

  println(cloneAndReset(new CompoundType))
}
