/**
 * Created by Mikio on 2015/10/13.
 */
object Main {

  def main(args: Array[String]) {
    val student3 = new Student3("1010111", "Yamada", 100, "メディア情報学")
    val student4 = new Student4("0911111", "Sato", 90, "経営情報学", "Yamaguchi")

    println("[3年生]")
    student3.printStatus()

    println("[4年生]")
    student4.printStatus()
  }
}
