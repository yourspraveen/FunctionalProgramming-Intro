abstract class Animal(name: String){
  def canSurviveFalls:Boolean
}

case class Cat(name: String) extends Animal(name){
  override def canSurviveFalls = true
}

case class Dog(name: String) extends Animal(name){
  override def canSurviveFalls = false
}

object PatternMatcher {

  def main(args: Array[String]): Unit = {
    val animal1 = new Cat("Kitty")
    val animal2 = new Cat("Tigger")
    val animal3 = new Dog("Rocky")
    val animal4 = new Dog("Lucky")

    // Note: watch for ordering of matches
    def matchAnimals(animal:Animal):String = animal match {
      case Cat("Kitty") => "my fav Meow"
      case Cat(_) => "Meow"
      case Dog(_) => "Whoof"
      case Dog("Lucky") => "Playful"
    }

    println(matchAnimals(animal1))
    println(matchAnimals(animal2))
    println(matchAnimals(animal3))
    println(matchAnimals(animal4)) // incorrect match
  }

}
