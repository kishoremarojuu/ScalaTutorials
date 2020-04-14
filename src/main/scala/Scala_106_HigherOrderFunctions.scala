import sun.nio.cs.ext.DoubleByteEncoder
//which takes functions as a parameter and gives function as output

object Scala_106_HigherOrderFunctions {
  def mat(x: Double, y: Double, f:(Double, Double)=>Double): Double = f(x,y);

  def main(args: Array[String]): Unit = {
    val result = mat(50, 20,(x,y)=>x+y);

    print(result)
  }
}
