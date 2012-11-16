//Find the sum of the even-numbered Fibonacci numbers not exceeding 4 million.

public class ProblemTwo {
  public static void main(String[] args){
    long currentFibonacciNumber = 1;
    long nextFibonacciNumber = 2;
    long sumOfEvenNumberedFibonacciNumbersNotToExceedFourMillion = 0;
    while (currentFibonacciNumber < 4000000) {
      if(currentFibonacciNumber%2==0){
        sumOfEvenNumberedFibonacciNumbersNotToExceedFourMillion += currentFibonacciNumber;
      }
      nextFibonacciNumber += currentFibonacciNumber;
      currentFibonacciNumber = nextFibonacciNumber - currentFibonacciNumber;
    }
    System.out.println(sumOfEvenNumberedFibonacciNumbersNotToExceedFourMillion);
  }
}