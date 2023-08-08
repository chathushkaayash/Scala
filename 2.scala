import Array._
object Q2 extends App{
  def calculateSquare(arr: Array[Int]): Array[Int] = {
    arr.map(arr => arr * arr);
  }

  val numbers = calculateSquare(Array(1, 2, 3, 4, 5));
  println(numbers.mkString(", "));


}