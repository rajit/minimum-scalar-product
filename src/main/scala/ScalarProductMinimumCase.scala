/**
 * Created by IntelliJ IDEA.
 * User: Rajit Singh
 * Date: 14/03/12
 * Time: 03:40
 * To change this template use File | Settings | File Templates.
 */

class ScalarProductMinimumCase(caseNumber: Int,  vector1: Array[Long], vector2: Array[Long]) {
  def tuples: Array[(Long, Long)] = {
    sorted(vector1) zip (sorted(vector2).reverse)
  }
  
  def sorted(list: Array[Long]): Array[Long] = {
    list.sortWith {
      case (v1, v2) => v1 < v2
    }
  }
  
  def scalarProduct: Long = {
    (0L /: tuples) {
      case (acc, (v1, v2)) => acc + (v1 * v2)
    }
  }

  override def toString = {
    "Case #" + caseNumber + ": " + scalarProduct + "\n"
  }
}
