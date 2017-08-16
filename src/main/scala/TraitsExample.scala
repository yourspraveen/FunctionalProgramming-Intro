trait Eatable {
  def eat = print(value)

  def value = ""
}

trait Organic extends Eatable {
  override def value = super.value + "Naturally made"
}

trait NonOrganic extends Eatable {
  override def value = super.value + "Artificially made"
}

trait Edible extends Eatable {
  override def value = super.value + "Can be eaten - "
}

trait InEdible extends Eatable {
  override def value = super.value + "Do not eat - "
}

class EdibleMushroom extends Eatable with Edible with Organic

class PoisonousMushroom extends Eatable with InEdible with Organic

class Gold extends Eatable with InEdible with NonOrganic

class Calcium extends Eatable with Edible with NonOrganic

object traitExample {
  def main(args: Array[String]): Unit = {
    val thing = new EdibleMushroom
    thing.eat
  }
}


