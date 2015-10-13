/**
 * Created by Mikio on 2015/10/13.
 */
class Student3(id: String, name: String, grade: Int, val course: String) extends Student(id, name, grade){

  override def printStatus(): Unit = {
    println("ID     : " + id)
    println("Name   : " + name)
    println("Grade  : " + grade)
    println("Course : " + course)
  }
}
