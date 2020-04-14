object Scala_104_MatchExpression {


  def main(args: Array[String]): Unit = {
    val age ="50";

  /*  age match {
      case "20" =>println("I am 20 years old")
      case "50" =>println("I am 50 years old")
      case "60" =>println("I am 60 years old")

      case _ => println("default");
    }*/


    val result = age match {
      case "20" =>age
      case "50" =>age
      case "60" =>age

      case _ => println("default");

    }
    println(result)


    val i=5;
    i match{
      case 1 | 3 | 5 | 9 =>print("this is odd number ")
      case 2 | 4 | 6 | 8 =>print("this is even number ")
    }
  }
}
