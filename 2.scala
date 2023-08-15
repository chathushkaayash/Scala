object Q2 extends App{
    print("Enter an integer: ")
    val input = scala.io.StdIn.readInt()
    
    val message = input match {
      case x if x <= 0 => "Negative/Zero is input"
      case x if x % 2 == 0 => "Even number is given"
      case x => "Odd number is given"
    }

    println(message)
}
