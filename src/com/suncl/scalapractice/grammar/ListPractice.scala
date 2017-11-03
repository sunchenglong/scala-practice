package com.suncl.scalapractice.grammar

object ListPractice {
  def main(args: Array[String]): Unit = {
    val x: List[String] = List("Runoob", "Google", "badiu")
    println(x.mkString(","))
    val y = 1 :: 2 :: (3 :: Nil)
    println(y.mkString(","))
    println((x ::: y).mkString(","))
    println(List.tabulate(10, 10)(_ * _).mkString(","))
    val amap = Map("a" -> 3, "b" -> 4)
    val bmap = Map("a" -> 5, "c" -> 6)
    val newmap = amap ++ bmap
    newmap.foreach(a => {
      println(a._1 + ":" + a._2)
    })
    val t = (1, 3.14)
    println(t.swap)
    val m  = (1,2,3,"4")
    m.productIterator.foreach{ i =>println("Value = " + i )}
  }
}
