/* Problem: https://www.hackerrank.com/challenges/30-review-loop/problem */

/* Solution: */

object Solution {

    def main(args: Array[String]) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution */        
        
        val sc = new java.util.Scanner (System.in);
        var T = sc.nextInt();
        var S = ""
        
        var input_string = Array[Array[String]]()
        var even_string = ""
        var odd_string = ""      
        
        sc.nextLine();
        
        for (i <- 0 to T - 1) {
          S = sc.nextLine();              
          input_string ++= Array(S.split(""))      
          for (j <- 0 to input_string(i).length - 1) {
              if ((j % 2) == 0) {even_string += input_string(i)(j)}
              else {odd_string += input_string(i)(j)}
            }
            println(even_string + " " + odd_string)
            even_string = ""
            odd_string = ""
        }
  }
}