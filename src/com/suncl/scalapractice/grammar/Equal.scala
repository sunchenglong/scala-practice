package com.suncl.scalapractice.grammar

trait Equal {
  def isEqual(x: Any): Boolean

  def isNotEqual(x: Any): Boolean = !isEqual(x)
}

class PointNew(xc: Int, yc: Int) extends Equal {
  var x: Int = xc
  var y: Int = yc

  override def isEqual(obj: Any): Boolean = {
    obj.isInstanceOf[PointNew] &&
      obj.asInstanceOf[PointNew].x == x
  }
}

object Test {
  def main(args: Array[String]): Unit = {
    val p1 = new PointNew(1, 2)
    val p2 = new PointNew(1, 3)
    val p3 = new PointNew(2, 3)
    println(p1.isEqual(p2))
    println(p1.isEqual(p3))
  }
}