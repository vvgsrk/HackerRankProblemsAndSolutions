/* Problem: https://www.hackerrank.com/challenges/30-operators/problem */

/* Solution: */

object Solution {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var meal_cost = sc.nextDouble();
        var tip_percent = sc.nextInt();
        var tax_percent = sc.nextInt();
        
        val tip = (meal_cost * tip_percent)/100
        val tax = (meal_cost * tax_percent)/100
        val totalCost = (meal_cost + tip + tax).round
        println("The total meal cost is " + totalCost + " dollars.")
    }
}