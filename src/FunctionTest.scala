object FunctionTest {
  def f1(f: (Int, Int) => Int) = f(2, 3)

  def f2(f: (Int, Int) => Int) = f(5, 6)

  var h1 = (x: Int, y: Int) => {
    x * y
  }

  var h2 = (x: Int, y: Int) => {
    x / y
  }

  def main(args: Array[String]): Unit = {
    var m1 = f1(h1)
    var m2 = f2(h2)
    println(m1, m2)
  }
}
