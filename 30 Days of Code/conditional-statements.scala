/* Problem: https://www.hackerrank.com/challenges/30-conditional-statements/problem */

/* Solution: */ 

object Solution {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var N = sc.nextInt();
        
        N match {
            case x if !(N % 2 == 0) => println("Weird")
            case x if ((N % 2 == 0) && (2 to 5 contains N)) => println("Not Weird")
            case x if ((N % 2 == 0) && (6 to 20 contains N)) => println("Weird")
            case x if ((N % 2 == 0) && N > 20) => println("Not Weird")     
            case _ => 
        }
    }
}