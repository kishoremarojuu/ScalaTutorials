//set will not have duplicates
//if you print the set, you will not see duplicates 

object Scala_113_Maps {

  def main(args: Array[String]): Unit = {

    val myMap: Map[Int,String] = Map(1 ->"aaa",2 ->"bbb",3 ->"ccc");

    println(myMap)

    //accesssing
    println(myMap(2));

   //accessing all keys
    println(myMap.keys);

    //accessing all values
    println(myMap.values);

    println("------------------------------------")

    //foreach loop
    myMap.keys.foreach{ key =>
      println("key:"+key);
      println("value:"+myMap(key));
    }
  }

  


}
