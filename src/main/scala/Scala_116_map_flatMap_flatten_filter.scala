

object Scala_116_map_flatMap_flatten_filter {
  def main(args: Array[String]): Unit = {

    val lst = List(1,2,3,4,5);
    val myMap= Map(1 ->"tom", 2 -> "kishore",3->"divya");

    println(lst.map(x =>x+2));
    println(myMap.map(x=>"hi "*2));
    println(myMap.view.mapValues(x=>"hi"+x));


    println("hello".map(_.toUpper));

    println(List(List(1,2,3), List(3,4,5)).flatten); //adding two lists in here

    println(lst.flatMap(x=>List(x, x+1)));


  }
}
