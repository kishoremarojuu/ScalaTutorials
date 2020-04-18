object Scala_110_Arrays {

  def main(args: Array[String]): Unit = {


    val myArray = new Array[Int](5);
    myArray(0)=20;
    myArray(1)=30;
    myArray(2)=40;
    myArray(3)=50;
    myArray(4)=60;

    //for each loop
    for(x<- myArray){
     // println(x);
    }

    //traditional for loop
    for(i <-0 to (myArray.length-1) ){
      println(myArray(i));
    }


  }

  


}
