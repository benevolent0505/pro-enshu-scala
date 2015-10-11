/**
 * Created by benevolent0505 on 2015/10/11.
 */
object TurtleGraphics {

  def main (args: Array[String]) {
    val frame = new TurtleFrame()
    val turtle = new Turtle()

    frame.add(turtle)

    turtle.down()

    for (i <- 1 to 20) {
      turtle.fd(25)
      turtle.rt(18)
    }
  }
}
