/**
 * Created by benevolent0505 on 2015/10/12.
 */
object Main {

  def main (args: Array[String]){
    val student1 = new Student("012200", "Dentsu Taro", 80)
    val student2 = new Student("012205", "Uec Jiro", 54)
    val student3 = new Student("012207", "Chofu Saburo", 70)
    val student4 = new Student("012210", "Enshu Shiro", 60)

    val proEnshu = new Lesson("Pro Enshu", "Yanai", 100)

    proEnshu.add(student1)
    proEnshu.add(student2)
    proEnshu.add(student3)
    proEnshu.add(student4)

    proEnshu.printLesson()

    proEnshu.sortId()
    proEnshu.printLesson()

    proEnshu.sortName()
    proEnshu.printLesson()

    proEnshu.sortGrade()
    proEnshu.printLesson()
  }
}
