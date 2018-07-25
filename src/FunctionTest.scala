object FunctionTest {
  def main(args: Array[String]): Unit = {
    def f1(f: (Int, Int) => Int) = f(2, 3)

    var h1 = (x: Int, y: Int) => {
      x * y
    }
    println(f1(h1))
  }
}
