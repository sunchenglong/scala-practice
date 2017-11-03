package com.suncl.scalapractice.grammar

object OptionPractice {
  def main(args: Array[String]): Unit = {
    val myMap: Map[String, String] = Map("key1" -> "value")
    val value1: Option[String] = myMap.get("key1")
    val value2: Option[String] = myMap.get("key2")
    println(value1)
    println(value2)
    println(myMap.getOrElse("key2", -1))
    val myList: List[String] = List("1", "abc", "d", "4")
    val iter = myList.iterator
    while(iter.hasNext){
      println(iter.next())
    }
    val iter2 = myList.iterator
    println(iter2.max)
  }
}
