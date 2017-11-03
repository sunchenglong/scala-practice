package com.suncl.scalapractice.grammar


object PackageTest {
  def main(args: Array[String]): Unit = {
    println("hello")
    println(addInt(1, 2))
    println(multiplier(10))
    factor = 20
    println(multiplier(10))
    val buf = new StringBuilder
    buf += 'a'
    buf ++= "addd  c"
    println(buf.toString())
    println(buf.length)
    println(buf.toString.intern())
    val z:Array[String] = new Array[String](3)
    z(0) = "a"
    z(1) = "abc"
    println(z(2))
    println(z.toString)
  }
  var factor = 5
  val multiplier = (i:Int) => i* factor
  def addInt(a: Int, b: Int): Int = {
    var sum: Int = 0
    sum = a + b
    sum
  }
}


package bob {
  package nav {

    private[bob] class Navigator {
      protected[nav] def useStarChart(): Unit = {
        class Leg {
          private[nav] val distance = 100
        }
      }
    }

    package lauch {

      object Vehicle {
        private[lauch] val guide = new Navigator
      }

    }

  }

}