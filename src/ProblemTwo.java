public class ProblemTwo {
  public static void main(String[] args){
    //find the sum of the even-numbered Fibonacci numbers not exceeding 4 million
    long prev = 1;
    long curr = 1;
    long next = 2;
    long memo = 0;
    while (curr < 4000000) {
    
      if(curr%2==0){
        memo += curr;
      }
      
      next += curr;
      curr = next - curr;
      prev = next - curr;
    }
    System.out.println(memo);
  }
}