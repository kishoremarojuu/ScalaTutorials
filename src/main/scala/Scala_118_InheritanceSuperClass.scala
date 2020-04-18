

class Polygon{
  def area: Double=0.0;

}

object Polygon{
  def main(args: Array[String]): Unit = {
    var poly = new Polygon;
    var rect = new Scala_118_InheritanceRectanle(5,4);
    //printArea(poly);
    printArea(rect)

    //triganle things
    var tria = new Scala_118_InheritanceTraingle(6,8);
    printArea(tria)
  }

  def printArea(p:Polygon){
    println(p.area);
  }
}

