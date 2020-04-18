
class User(var name:String, var age: Int);

object Scala_117_Classes {    //be default we use Object on class, that means it is singleton,
  def main(args: Array[String]): Unit = {

    var user = new User("Kishore", 28);

    println("printing name first time:"+user.name);

    user.name= "divya";   // you can override as this is var

    println("printing name second  time:"+user.name);


  }
}
