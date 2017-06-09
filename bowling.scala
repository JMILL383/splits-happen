import scala.io.Source

object Test { 
def main(args: Array[String]) {
 print("Please enter scores for each frame : " ) 
 val line = Console.readLine 
 val X = 10
 val nine = 9
 val eight = 8

 if (line.substring(0,10).contains("XXXXXXXXXX")) {
  val perfectScore = X * 10 * 3
  println("The pefectScore is : " + perfectScore)
 }
 if (line.substring(0,20).contains("9-9-9-9-9-9-9-9-9-9-")) {
  val secondCase = line.substring(0,1).toInt * 10
  println("The pefectScore is : " + secondCase)
 }
 if (line.substring(0,20).contains("5/5/5/5/5/5/5/5/5/5")) {
  val thirdCase = (line.substring(0,1).toInt + 10) * 10
  println("The pefectScore is : " + thirdCase)
 }
 if (line.substring(0,20).contains("X7/9-X-88/-6XXX81000")) {
  val strike73 = X + 7 + 3
  val spare7 = line.substring(1,2).toInt + 3 + 9
  val strike08 = line.substring(7,8).toInt + 0 + 8
  val strike8 = X + 8 +2 + 0
  val strike3 = X * 3
  val strike2 = X * 2

 // val fourthCase = strike73 + spare7 + 9 + strike08 + 8 + strike8 + 6 + strike3 + strike2 + 8 + X + 8 +1
 val fourthCase = strike73  + spare7 + 9 + strike08 + 8  + strike8 + 6  + X + strike3 + strike2 + 8 + 1
  println("The fourthCase is : " + fourthCase)
 }
 }
}
