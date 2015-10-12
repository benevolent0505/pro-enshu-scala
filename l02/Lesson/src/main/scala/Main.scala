/**
 * Created by benevolent0505 on 2015/10/12.
 */
object Main {

  def main (args: Array[String]){
    val student1 = new Student("01110", "Suzuki", 200)
    val student2 = new Student("01111", "Yamada", 80)

    student1.printStatus()
    student2.printStatus()
  }
}
