//Tuple can contain all datatypes in it
//it can be together of int, string, true or etc, for more info refer
//https://www.youtube.com/watch?v=ZQQs44OHJLc&list=PLS1QulWo1RIagob5D6kMIAvu7DQC5VTh3&index=25


object Scala_114_Tuples {
  def main(args: Array[String]): Unit = {

    val myTuple = (1,2,"kishore", true);
    val mytuple2 = new Tuple3(1,"ksihore", true);


    println(myTuple);


    //foreach loop
    mytuple2.productIterator.foreach{
      i=>println(i);
    }






  }
}
