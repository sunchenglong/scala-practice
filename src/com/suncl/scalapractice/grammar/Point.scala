package com.suncl.scalapractice.grammar

class Point(xc: Int, yc: Int) {
  var x: Int = xc
  var y: Int = yc

  def move(dx: Int, dy: Int): Unit = {
    x += dx
    y += dy
    println("x: " + x)
    println("y: " + y)
  }
}

class Location(val xc: Int, val yc: Int,
               val zc: Int) extends Point(xc, yc) {
  var z: Int = zc


  override def move(dx: Int, dy: Int): Unit = {
    x += dx * 2
    y += dy * 3
    println("x: " + x)
    println("y: " + y)
  }

  def move(dx: Int, dy: Int, dz: Int) {
    x = x + dx
    y = y + dy
    z = z + dz
    println("x 的坐标点 : " + x)
    println("y 的坐标点 : " + y)
    println("z 的坐标点 : " + z)
  }
}

object TestNew {
  def main(args: Array[String]): Unit = {
    val pt = new Point(1, 3)
    pt.move(10, 20)
    println(pt.x)
    println(pt.y)
    val pt2: Point = new Location(1, 3, 4)
    pt2.move(10, 10)

  }
}
