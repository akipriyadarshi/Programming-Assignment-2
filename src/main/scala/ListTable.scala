//program to print table of each element present in the list
object ListTable extends App {
  //method to print the table of each element present in list
  def printEach(int: Int):String = {
    for (i <- 1 to 10) println(int + "* " + i + " = " + int * i)
    print("\n\n")
    "printing table of each element from 1 to 10"
  }
//this method accepts a lost and will call another method to print each element's table present in the list
  def printTable(list: List[Int]): String = {
    for (i <- list) {
      printEach(i)
    }
    "printing table of each element one by one"
  }

  val l = List(1, 2, 3, 4, 5)//we can also provide list by taking inputs from the user as provided in class ListMethod
  printTable(l)

}
