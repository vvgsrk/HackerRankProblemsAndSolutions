/* Problem: https://www.hackerrank.com/challenges/fp-list-replication/problem */

/* Solution: */

def f(num:Int, arr:List[Int]): List[Int] = { 
    
    import scala.collection.mutable.ListBuffer
    
    var result_list = ListBuffer[Int]()
    
    for (i <- arr) { 
      
      for(j <- 1 to num) { 
        
        result_list += arr(i-1) 
        }
      
    }
    
    result_list.toList
}
  
  