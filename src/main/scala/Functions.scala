object Functions {

  def add(a: Int, b: Int): Int = {
    a + b
  }

  def multiply(a: Int, b: Int): Int = {
    a * b
  }

  def add5 = add(5, _: Int)

  def double = multiply(2, _: Int)

  //def square(a:Int) = multiply(a,a)

  def useHigherOrderFunction(a: Int, double: Int => Int): Unit = {
    print(double(a))
  }

  def main(args: Array[String]) {
    useHigherOrderFunction(5, double)
  }

}
