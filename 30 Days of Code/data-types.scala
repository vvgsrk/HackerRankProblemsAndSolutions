/* Problem: https://www.hackerrank.com/challenges/30-data-types/problem */

/* Solution: */ 

object Solution {
    def main(args: Array[String]) {
        val i = 4
        val d = 4.0
        val s = "HackerRank "
		
		// Read values of another integer, double, and string variables
        // Note use scala.io.StdIn to read from stdin
        val intgr: Int = scala.io.StdIn.readInt()
        val dbl: Double = scala.io.StdIn.readDouble()
        val text: String = scala.io.StdIn.readLine()
        
        // Print the sum of both the integer variables
        println(i + intgr)    
        
        // Print the sum of both the double variables
        println(d + dbl)    
        
        // Concatenate and print the string variables
        // The 's' variable above should be printed first.
        println(s + "" + text)
    }
}		