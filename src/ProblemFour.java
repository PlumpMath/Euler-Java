//Find the largest palindrome made from the product of two 3-digit numbers.

public class ProblemFour {
  public static void main ( String[] args ) {
    int largestPalindromeYet = 0;
    for ( int i = 100; i < 1000; i++ ) {
      for ( int j = i; j < 1000; j++ ) {
        if (isPalindrome(i*j) && i*j > largestPalindromeYet) {
          largestPalindromeYet = i*j;
        }
      }
    }
    System.out.println("The largest palindrome made from the product of two 3-digit numbers is: " + largestPalindromeYet);
  }
  private static boolean isPalindrome( int n ) {
    //checks if integer reads the same forwards and backwards
    StringBuilder printedNumber = new StringBuilder(Integer.toString(n));
    return (printedNumber.toString()).equals((printedNumber.reverse()).toString());
  }
}