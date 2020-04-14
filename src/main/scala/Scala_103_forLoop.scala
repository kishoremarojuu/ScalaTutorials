object Scala_103_forLoop {

  def main(args: Array[String]): Unit = {


    for(i <-1.to(10)){
      println(i)
    }

    for(i<-1 to 10; j<-1 to 4){
      println(i + j );
    }
  }
}
