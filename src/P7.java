//What is the 10 001st prime number?

public class P7 {
  public static void main (String[] args) {
    int counter = 0;
    int currentNumber = 1;
    while (counter < 10001) {
      currentNumber++;
      if (isPrime(currentNumber)) {
        counter++;
      }
    }
    System.out.println(currentNumber);
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