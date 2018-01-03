import java.io.File

import scala.io.Source

object Learning extends App {

  def processFile(filename: String, width: Int): Unit = {
    def processLine(line: String): Unit = {
      if (line.length > width)
        println(filename + ": " + line.trim)
    }

    Source.fromFile(filename)
      .getLines()
      .filter(_.contains("."))
      .foreach(processLine)
  }

  val increase = (x: Int) => x + 1

  new File(".")
    .listFiles()
    .foreach(println)

  processFile("src/main/scala/Learning.scala", 10)
}
