//Find the product abc which is a Pythagorean triplet where a + b + c = 1000.

public class P9 {
  public static void main (String[] args) {
    int product = 0;
    for ( int i = 1; i <= 1000; i++ ) {
      for ( int j = 1000-i; j >= 1; j-- ) {
        int k = 1000-(j+i);
        if(i*i+j*j==k*k){
          product = i*j*k;
          break;
        }        
      }
    }
    System.out.println(product);
  }
}