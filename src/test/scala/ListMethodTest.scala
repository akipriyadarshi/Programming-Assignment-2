//testing the ListMethod.scala class
import org.scalatest.flatspec.AnyFlatSpec

class ListMethodTest extends AnyFlatSpec {
  var list = List(1, 3, 5)
  var list1 = List(1, 4, 8, 10)
  " method forTest " should "return sum of first and last element of list " in {
    assert(ListMethod.forTest(list) == 6)
  }

  it should "return updated value " in {
    assert(ListMethod.forTest(list1) == 11)
  }
}
