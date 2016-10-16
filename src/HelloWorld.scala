/**
  * Created by Chenglong Sun on 2016/10/16.
  */

import org.apache.spark._

object HelloWorld {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("Spark pi").setMaster("local")
    val sc = new SparkContext(conf)
    val file = sc.textFile("src/data.txt")
    val data = file.map(_.split(",")).map(item => (s"${item(0)}-${item(1)}",item(2)))
    data.collect().foreach(println)
    println("hello world")
  }
}
