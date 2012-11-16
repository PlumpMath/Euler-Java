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
    String printedNumber = Integer.toString(n); // => "888"
    String printedNumberReversed = ""; // => ""
    for ( int i = printedNumber.length() - 1; i >= 0; i-- ) {
      printedNumberReversed += printedNumber.charAt(i);
    }
    return printedNumber.equals(printedNumberReversed);
  }
}