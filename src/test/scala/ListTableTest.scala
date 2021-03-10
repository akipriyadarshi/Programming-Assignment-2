//testing ListTable.scala class
import org.scalatest.flatspec.AnyFlatSpec
class ListTableTest extends AnyFlatSpec {
  "printTable" should "return the message after being called" in {
    assert(ListTable.printTable(List(1, 5, 9)) == "printing table of each element one by one")
  }
  "printEach" should "return that it is printing table from 1 to 10" in {
    assert(ListTable.printEach(5)== "printing table of each element from 1 to 10")
  }

}
