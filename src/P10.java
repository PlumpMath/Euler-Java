//Find the sum of all the primes below two million.

import java.util.ArrayList;

public class ProblemTen {
  public static void main (String[] args) {
    long memo = sumOfPrimesBelow(2000000L);
    System.out.println(memo);
  }
  private static long sumOfPrimesBelow(long n){
    ArrayList<Long> primes = new ArrayList<Long>();
    primes.add(2L);
    long memo = 2;
    for (long i=2L;i<=n;i++){
      long counter = 0;
      boolean exausted = true;
      for (long prime : primes) {
        counter++;
        if (i%prime==0) {
          exausted = false;
          break;
        }
      }
      if (exausted) {
        memo += i;
        primes.add(i);
      }
    }
    return memo;
  }
}