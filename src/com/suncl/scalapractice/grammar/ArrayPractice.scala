package com.suncl.scalapractice.grammar

object ArrayPractice {

  def main(args: Array[String]): Unit = {
    val myList = Array(1.9, 2.0, 1.0, 0.4, -1)
    for (x <- myList) {
      println(x)
    }

    for (i <- 0 until (myList.length)) {
      println(myList(i))
    }

    for (i <- 0 to (myList.length - 1)) {
      println(myList(i))
    }

    val newList = Array.concat(myList, myList.reverse)
    for (x <- newList) {
      println(x)
    }

    val mat = Array.ofDim[Int](3, 3, 4)
    mat(1)(2)(3) = 3
    for (i <- 0 until (mat.length)) {
      for (j <- 0 until (mat.apply(0).length)) {
        for (k <- 0 until (mat.apply(0).apply(0).length)) {
          println(mat(i)(j)(k))
        }
      }
    }
    val a = Array.range(10, 20, 2)
    val b = Array.range(10, 20)
    for( x <- a ) {
      print(" " + x)
    }
    println()
    for(x <- b) {
      print(" " + x)
    }
  }
}
