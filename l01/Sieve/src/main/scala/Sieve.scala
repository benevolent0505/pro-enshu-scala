/**
 * Created by benevolent0505 on 2015/10/11.
 * http://bach.istc.kobe-u.ac.jp/lect/ProLang/org/scala-sieve.html ここのコード
 * http://www.shigemk2.com/entry/scala_sieve 上の短縮ver (わからん)
 */
object Sieve {

  def sieve(xs: List[Int]): List[Int] = {
    if (xs.isEmpty) {
      Nil
    } else {
      // http://www.ne.jp/asahi/hishidama/home/tech/scala/collection/list.html#_colon_colon
      // :: ←はメソッドで先頭に要素を追加したリストを返す (例: 9 :: List(1, 2, 3) は List(9, 1, 2, 3))
      xs.head :: sieve(xs.filter(_ % xs.head != 0))
    }
  }

  // Range(2, n).toList で2 ~ n までのListを生成
  def primes(n: Int) = sieve(Range(2, n).toList)

  def main(args: Array[String]) {
    primes(200).foreach { println }
  }
}
