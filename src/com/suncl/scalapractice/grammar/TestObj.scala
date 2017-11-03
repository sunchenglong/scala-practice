package com.suncl.scalapractice.grammar

import ChecksumAccumulator._
object TestObj {
  def main(args: Array[String]): Unit = {
    println("Java 1:" + calculate("Java"))
    println("Java 2:" + calculate("Java"))
    println("Scala :" + calculate("Scala"))
  }
}
