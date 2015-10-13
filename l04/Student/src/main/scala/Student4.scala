/**
 * Created by Mikio on 2015/10/13.
 */
class Student4(id: String, name: String, grade: Int, course: String, val supervisor: String)
  extends Student3(id, name, grade, course) {

  override def printStatus(): Unit = {
    super.printStatus()

    println("Supervisor : " + supervisor)
  }
}
