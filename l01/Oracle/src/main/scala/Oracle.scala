import scala.util.Random

/**
 * Created by benevolent0505 on 2015/10/10.
 */
object Oracle {

  def oracleResult() : String = {
    val rnd = Random

    rnd.nextFloat() match {
      case i if (i == 0.0) => "Very Bad"
      case i if (i < 0.2) => "Bad"
      case i if (i >= 0.2 && i < 0.7) => "So so..."
      case i if (i > 0.7) => "Good"
      case i if (i == 1.0) => "Today is happy!"
    }
  }

  def main (args: Array[String]): Unit ={
    println(oracleResult());
  }
}