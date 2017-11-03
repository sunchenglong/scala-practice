package com.suncl.scalapractice.grammar

class Marker private(val color: String) {
  println("Create: " + this)

  override def toString: String = "Color define: " + color
}

object Marker {
  private val markers: Map[String, Marker] = Map(
    "red" -> new Marker("v_red"),
    "blue" -> new Marker("v_blue"),
    "green" -> new Marker("v_green")
  )

  def apply(color: String): Marker = {
    if (markers.contains(color)) markers(color) else null
  }

  def getMarker(color: String): Marker = {
    if (markers.contains(color)) markers(color) else null
  }

  def main(args: Array[String]): Unit = {
    println(Marker("red"))
    println(Marker getMarker "blue")
  }

}
