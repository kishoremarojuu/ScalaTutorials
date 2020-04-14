//a closure is a function which uses one ore more variables declared outside this function

object Scala_107_ClosuresExample {

  def main(args: Array[String]): Unit = {

   var number=10;
    val add = (x: Int) =>x+number;

    println(add(20));
  }
}
