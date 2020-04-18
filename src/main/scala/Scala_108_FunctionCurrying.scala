//a closure is a function which uses one ore more variables declared outside this function

object  Scala_108_FunctionCurrying {

  def main(args: Array[String]): Unit = {
    println(add2(20)(10));
  }

  def add2(x:Int) = (y:Int) =>x+y;

}
