public class ProblemTwo {
  public static void main(String[] args){
    //find the sum of the even-numbered Fibonacci numbers not exceeding 4 million
    long currentNumber = 1;
    long nextNumber = 2;
    long sum = 0;
    while (currentNumber < 4000000) {
    
      if(currentNumber%2==0){
        sum += currentNumber;
      }
      
      nextNumber += currentNumber;
      currentNumber = nextNumber - currentNumber;
    }
    System.out.println(sum);
  }
}