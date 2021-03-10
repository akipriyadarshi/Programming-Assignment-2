//A program to Find the last index and its value from the list
import scala.io.StdIn.{readInt, readLine}
object ListMethod extends App {
  var count = -1
  var in = ""
  var list = List[Int]()

  def insert( x: Int): List[Int] = {
    list = list :+ x
    list
  }
  def forTest(list:List[Int]):Int=list.head+list.last //A utility method for enabling the test cases. Refer to the test directory for more details
 //it is a user friendly program.user will give integer value to the empty list
  do {

    println("please enter Y for adding element in a list else enter N")
    in = readLine()
    if (in == "Y") {
      println("please enter the integer you want to add")
      val x = readInt()
      insert(x)
    }
  } while (in == "Y")

  for (i <- list) {
    count += 1
    print(i + "  ")
  }
  println()
  println("Last index is " + count + "(starting with 0) and the value at last index is " + list(count))
}
