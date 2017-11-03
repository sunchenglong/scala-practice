package com.suncl.scalapractice.grammar

class ChecksumAccumulator {
  private var sum = 0

  def add(b: Byte): Unit = {
    sum += b
  }

  def checksum(): Int = ~(sum & 0xff) + 1
}

object ChecksumAccumulator {
  private var cache = Map[String, Int]()

  def calculate(s: String): Int = {
    if (cache.contains(s))
      cache(s)
    else {
      val acc = new ChecksumAccumulator
      for (c <- s)
        acc.add(c.toByte)
      val cs = acc.checksum()
      cache += (s -> cs)
      println("s:" + s + "  cs:" + cs)
      cs
    }
  }

  def main(args: Array[String]) {
    println("Java 1:" + calculate("Java"))
    println("Java 2:" + calculate("Java"))
    println("Scala :" + calculate("Scala"))
  }
}