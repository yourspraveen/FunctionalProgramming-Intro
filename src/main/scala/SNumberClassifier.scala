object SNumberClassifier {

  def factors(number: Int): Seq[Int] = (1 to number) filter (number % _ == 0)

  def sum(factors: Seq[Int]): Int = factors.foldLeft(0)(_ + _)

  def isFactor(number: Int, potentialFactor: Int):Boolean = number % potentialFactor == 0

  def isPerfect(number: Int):Boolean = factors(number).sum - number == number

  def isAbundant(number: Int):Boolean = factors(number).sum - number > number

  def isDeficient(number: Int):Boolean = factors(number).sum - number < number

  def isNegative(number: Int):Boolean = number < 0

  def validate(input:Int, checkerfunction:(Int) => Boolean):String ={
    isNegative(input) match {
      case true => "Negative number"
      case false => checkerfunction(input) match {
        case true => "valid"
        case false => "invalid"
      }
    }
  }


  def main(args: Array[String]): Unit = {
    print(validate(5,isFactor(_,5)))
  }
}


