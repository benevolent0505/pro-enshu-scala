/**
 * Created by benevolent0505 on 2015/10/12.
 */
class Lesson(val name: String, val teacher: String, val max: Int) {

  private var students: Seq[Student] = Seq()

  def add(student: Student): Unit = {
    students = students :+ student
  }

  def printLesson(): Unit = {
    println("Lesson   : " + name)
    println("Teacher  : " + teacher)
    println("Students : " + students.length)

    students.foreach { _ printStatus }

    println("----------")
  }
}
