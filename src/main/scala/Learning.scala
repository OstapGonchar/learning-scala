import Element.elem

object Learning extends App {

  private val arrayElement = elem(Array("test"))

  println(s"Height is ${arrayElement.height} and width is ${arrayElement.width}")

  private val diffWidths: Element = elem(Array("hello")) above elem(Array("world!"))

  println(diffWidths)

  private val diffHeights: Element = elem(Array("one", "two")) beside elem(Array("one"))

  println(diffHeights)

  println(null)
}
