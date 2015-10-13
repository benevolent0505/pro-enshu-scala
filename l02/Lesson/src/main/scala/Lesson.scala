/**
 * Created by benevolent0505 on 2015/10/12.
 */
class Lesson(val name: String, val teacher: String, val max: Int) {

  private var students: Seq[Student] = Seq()

  def add(student: Student): Unit = {
    if (students.length <= max) {
      students = students :+ student
    }
  }

  def sortId(): Unit = {
    students = students.sortWith((s1, s2) => s1.id < s2.id)
  }

  def sortName(): Unit = {
    students = students.sortWith((s1, s2) => s1.name < s2.name)
  }

  def sortGrade(): Unit = {
    students = students.sortWith((s1, s2) => s1.grade > s2.grade)
  }

  def printLesson(): Unit = {
    println("Lesson   : " + name)
    println("Teacher  : " + teacher)
    println("Students : " + students.length)

    students.foreach { _ printStatus }

    println("----------")
  }
}
