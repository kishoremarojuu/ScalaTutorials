object Scala_105_MethodCreation {

  object Math{
    def add(value: Int, value1: Int): Int =
      return value+value1;
    def square(x: Int)=x*x;

  }
  //first approach
  def add(value: Int, value1: Int): Int =
    return value+value1;

  //second approach
  def sub1(value: Int, value1: Int): Int = {
    return value-value1;
  }

  def multiply(value: Int, value2: Int) = value*value2;

  def defaultParametersMethod(value: Int=2, value2: Int=3){
    return value+value2;
  }

  def returningVoidmethod(x: Int, y: Int): Unit ={
    println("I am good thanks")
  }

  //we can declare operators as method name
  def *(value: Int, value1: Int): Int =
    return value+value1;

  def main(args: Array[String]): Unit = {
    println(add(45,12));
    println(sub1(60,30));


    println(multiply(5,2));

    //calling funnction insisde object
    println(Math.add(5,6));

    println(Math.square(3));     //  println(Math square(3)); --> this will also work called as synatical sugar wih single arguments


    println(defaultParametersMethod());

   // defaultParametersMethod(returningVoidmethod(2,9));

    print(*(2,3));


    //function inside variable, this is called annonymouse function
    var someVarible = (x: Int, y: Int) => x + y;
    println(someVarible(20,30));




  }

}
