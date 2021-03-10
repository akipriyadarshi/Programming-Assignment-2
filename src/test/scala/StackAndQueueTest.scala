//testing StackAndQueue.scala class using various test cases
import org.scalatest.flatspec.AnyFlatSpec
class StackAndQueueTest extends AnyFlatSpec {
  val stack1=new Stack(List[Int](),2)
  val queue=new Queue(List[Int](),3)
  "stack push" should "push element to the top of stack" in {
    assert(stack1.push(10) == List(10))
    assert(stack1.push(20) == List(10, 20))
  }
  "stack pop" should "pop the top element of stack" in{
    assert(stack1.pop()==List(10))
    assert(stack1.pop()==List())
  }

  "queue enqueue" should "insert element from rear" in {
    assert(queue.enqueue(10)==List(10))
    assert(queue.enqueue(100)==List(10,100))
  }
  "queue dequeue" should "remove the element from front " in{
    assert(queue.dequeue()==List(100))
  }
 "queue dequeue" should "return empty list if last only one element is there in queue"in{
   assert(queue.dequeue()==List())
 }

}
