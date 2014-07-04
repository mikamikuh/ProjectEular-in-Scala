object Problem1 {
    def main(args: Array[String]): Unit = {
      (0 to 1000).toList.filter(x => (x % 3) == 0 || (x % 5) == 0).foldLeft(0)(_ + _)
    }
}