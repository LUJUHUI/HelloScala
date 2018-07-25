object ScalaTest {
  def main(args: Array[String]): Unit = {
    val x = 1
    val result = {
      if(x > 1)
        0
      else if(x < 1)
        -1
      else
        2
    }
    println(result)
  }
}

