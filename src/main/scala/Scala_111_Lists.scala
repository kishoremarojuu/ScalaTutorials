object Scala_111_Lists {

  def main(args: Array[String]): Unit = {

    //val myArray = new Array[Int](5);
    val myList: List[Int] = List(1,2,3,45,6);
    val myList2: List[String] = List("kishore","divya","cap1","3m");


  //println(myList);
  //println(myList2);


    myList.foreach(println);

    var sum: Int =0;
    myList.foreach(sum += _);
    println("printing Sum:"+sum);

    //traditional for loop
    for(i <-0 to (myList2.length-1) ){
      println(myList2(i));
    }

    //for each loop
    for(name <- myList2){
      //println(name);
    }


  }

  


}
