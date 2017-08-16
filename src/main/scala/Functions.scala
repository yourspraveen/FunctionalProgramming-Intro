object Functions {

  def add(a: Int, b: Int): Int = a+b

  def multiply(a: Int, b: Int): Int = a * b

  def square(a: Int):Int = multiply(a,a)

  //Curry
  def add5 = add(5, _: Int)
  def double = multiply(2, _: Int)

  //First order function
  val mySquare: (Int) => Int = square

  //Higher order function
  def useHigherOrderFunction(input: Int, fn: Int => Int): Int = {
    fn(input)
  }

  def main(args: Array[String]) {
    println(mySquare(5))

    println(useHigherOrderFunction(5, double))
  }

}
