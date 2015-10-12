/**
 * Created by benevolent0505 on 2015/10/12.
 */
class Student(val id: String, val name: String, var grade: Int) {
  // こんなことしていいのかわからない…
  grade = grade match {
    case i if (i < 0) => 0
    case i if (i > 100) => 100
    case _ => grade
  }

  def printStatus() = println(id + ", " + name + ", " + grade)
}
