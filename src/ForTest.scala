object ForTest {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 3; j <- 1 to 3; if i != j) {
      println(10 * i + j)
    }
  }
}
