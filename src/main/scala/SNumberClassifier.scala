object SNumberClassifier {

  def isFactor(number: Int, potentialFactor: Int) =
    number % potentialFactor == 0

  def factors(number: Int) =
    (1 to number) filter (number % _ == 0)

  def sum(factors: Seq[Int]) =
    factors.foldLeft(0)(_ + _)

  def isPerfect(number: Int) =
    factors(number).sum - number == number

  def isAbundant(number: Int) =
    factors(number).sum - number > number

  def isDeficient(number: Int) =
    factors(number).sum - number < number


  def validate(input:String, dbSelect:(String) => String): Unit ={


    dbSelect(input)
  }

  def dbSelect(queryparam:String):String={

""
  }
}


