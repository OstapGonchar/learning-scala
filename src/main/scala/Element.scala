abstract class Element {
  def contents: Array[String]

  def height: Int = contents.length

  def width: Int = if (height == 0) 0 else contents(0).length
}

class ArrayElement(val contents: Array[String]) extends Element {
  require(if (height != 0) contents.map(_ length).forall(_ == contents.head.length) else true)
}

class LineElement(s: String) extends ArrayElement(Array(s)) {
  override def width: Int = s.length

  override def height: Int = 1
}

object Element {
  def elem(s: String): Element = new ArrayElement(Array(s))
}
