//Find the sum of all the multiples of 3 or 5 below 1000.

public class P1 {
  public static void main(String[] args){
    int a = 1;
    int memo = 0;
    while (a < 1000){
      if (a%3==0 || a%5==0){
        memo += a;
      }
      a ++;
    }
    System.out.println(memo);
  }
}