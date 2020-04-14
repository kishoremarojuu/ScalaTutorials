object Scala_101_StrinInterpolation {

  def main(args: Array[String]): Unit = {


    val name = "mark"
    val age = 18.5
    println(name + " is " + age + " years old")

    //s String Interpolator
    println(s"$name is $age years old")
    //f String Interpolator
    println(f"$name%s is $age%f years old")
    println(s"Hello \nworld")
    //raw String Interpolator
    println(raw"Hello \nworld")
  }
}

