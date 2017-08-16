
//Class construct
class HelloWorld(user: String) {
  def name: String = user + HelloWorld.world
}

//Companion Object
object HelloWorld {
  val world = " world"

  def main(args: Array[String]): Unit = {
    val instance = new HelloWorld("Scala")
    print(instance.name)
  }
}