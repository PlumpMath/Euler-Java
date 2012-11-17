//Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

public class P6 {
  public static void main (String[] args) {
    int sumOfSquares = 0;
    int squareOfSum = 0;
    for( int i = 1; i <= 100; i++ ) {
      sumOfSquares += i*i;
      squareOfSum += i;
    }
    squareOfSum *= squareOfSum;
    int answer = Math.abs(sumOfSquares-squareOfSum);
    System.out.println("The answer is: " + answer);
  }
}