import org.scalatest.FunSpec

/**
 * Created by IntelliJ IDEA.
 * User: Rajit Singh
 * Date: 14/03/12
 * Time: 03:06
 * To change this template use File | Settings | File Templates.
 */

class ScalarProductMinimumsTest extends FunSpec {
  describe("Running the ScalarProductMinimums application") {
    it("should return a single minimum scalar product for an input file with a single case") {
      val minimums = new ScalarProductMinimums(List("1", "1", "1", "1"))
      assert(minimums.output == "Case #1: 1\n")
    }
    
    it("should return the correct scalar product for a single set of vectors with two coordinates each") {
      val minimums = new ScalarProductMinimums(List("1", "2", "1 0", "0 1"))
      assert(minimums.output == "Case #1: 0\n")
    }
  }
}
