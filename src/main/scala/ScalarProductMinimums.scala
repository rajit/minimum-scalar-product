/**
 * Created by IntelliJ IDEA.
 * User: Rajit Singh
 * Date: 14/03/12
 * Time: 03:17
 * To change this template use File | Settings | File Templates.
 */

class ScalarProductMinimums(input: List[String]) {
  val split = input match {
    case header :: xs => {
      (header, xs)
    }
  }
  val cases = getNumberOfCases
  val casesIterator = zipThree(split._2)

  def zipThree(strings: List[String]): List[(String, String)] = strings match {
    case v1 :: v2 :: v3 :: xs => (v2, v3) :: zipThree(xs)
    case Nil => Nil
  }

  def getNumberOfCases = {
    split._1.toInt
  }

  def parseVector(line: String) = {
    line.split(' ').map {
      _.toLong
    }
  }

  def output: String = {
    var caseCount = (1 until cases + 1).iterator
    casesIterator.map {
      pair => new ScalarProductMinimumCase(caseCount.next(), parseVector(pair._1), parseVector(pair._2))
    }.mkString("")
  }
}
