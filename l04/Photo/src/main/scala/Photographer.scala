/**
 * Created by Mikio on 2015/10/14.
 */
class Photographer {

  private var devices: Seq[Photo] = Seq()

  def add(photo: Photo): Unit = {
    devices = devices :+ photo
  }

  def takeAll(): Unit = {
    devices.foreach { _ takePhoto }
  }
}
