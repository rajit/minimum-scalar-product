import io.Source
import java.io.FileWriter

/**
 * Created by IntelliJ IDEA.
 * User: Rajit Singh
 * Date: 14/03/12
 * Time: 02:43
 * To change this template use File | Settings | File Templates.
 */

object Application {
  def main(args: Array[String]) {
    // Specify input file
    // Create reader
    // For each set of vectors, calculate minimum scalar product
    val inputFile = "A-small-practice.in"
    val output = new ScalarProductMinimums(Source.fromFile(inputFile).getLines().toList).output
    val fw = new FileWriter("A-small-practice.out")
    fw.write(output)
    fw.close()
  }
}
