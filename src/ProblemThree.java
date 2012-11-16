import java.util.ArrayList;

public class ArrayLists {
  public static void main(String[] args){
    //Find the largest prime factor of 600851475143
    long numberToFindLargestPrimeFactorOf = 600851475143L;
    ArrayList<Long> factors = getListOfFactors(numberToFindLargestPrimeFactorOf);
    long largestPrimeSoFar = 1;
    for (long factor : factors){
      if(isPrime(factor) && factor > largestPrimeSoFar){
        largestPrimeSoFar = factor;
      }
    }
    
    if (largestPrimeSoFar == 1){
      System.out.println(numberToFindLargestPrimeFactorOf + " has no prime factors.");
    }else{
      System.out.println("The largest prime factor of " + numberToFindLargestPrimeFactorOf + " is: " + largestPrimeSoFar);
    }
    
  }
  private static ArrayList<Long> getListOfFactors(long n){
    ArrayList<Long> factors = new ArrayList<Long>();
    double sqrtOfLargeNumber = Math.sqrt((double)n);
    long sqrtOfBANRoundedUp = (long) sqrtOfLargeNumber;
    for (long i=2;i<=sqrtOfBANRoundedUp;i++){
      if(n%i==0){
        factors.add(i);
        factors.add(n/i);
      }
    }
    return factors;
  }
  private static boolean isPrime(long n){
  //really inefficient way of checking if a number is prime
    for (long i=2;i<n;i++){
      if (n%i==0){
        return false;
      }
    }
    return true;
  }
}