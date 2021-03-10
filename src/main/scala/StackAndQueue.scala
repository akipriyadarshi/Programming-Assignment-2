//Implementing stack and queue using list
//i have also provided the feature to fix the size of stack and queue

class Queue(var list: List[Int], num: Int) { // Queue class to implement Queue using list
  var front = 0
  var rear = 0
//method to add element in a queue
  def enqueue(x: Int): List[Int] = {
    if (num == rear) {
      print("Queue is full")
      list
    } else {
      list = list :+ x
      rear += 1
      list
    }


  }
//method to remove element from queue
  def dequeue(): List[Int] = {
    if (front == rear) {
      print("Queue is empty")
      list
    } else {
      list = list.drop(1)
      rear = rear - 1
      list
    }

  }

  def show() = for (element <- list) print(element + "  ")

}
//stack class to implement stack using list
class Stack(var l: List[Int], num: Int) {
  def push(x: Int): List[Int] = {
    if (l.length < num) {
      l = l :+ x

    } else println("stack overflow")
    l
  }
//method to pop the top element of the stack
  def pop(): List[Int] = {
    if (l.nonEmpty) {
      l = l.dropRight(1)

    } else println("Stack underflow")
    l
  }

  def show() = for (element <- l) print(element + "  ")//printing all the element after performing multiple push and pop operations
}


object StackAndQueue extends App {
  val queue = new Queue(List(), 3)//here 3(second parameter) means we are restricting the size of queue to be 3 same as in case of stack
  queue.enqueue(100)
  queue.enqueue(200)
  queue.dequeue()
  queue.enqueue(100)
  queue.show()
  println()

  val stack = new Stack(List(), 3)
  stack.push(5)
  stack.push(10)
  stack.pop()
  stack.push(15)
  stack.show()
}

