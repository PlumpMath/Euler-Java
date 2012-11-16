public class ProblemOne {
  public static void main(String[] args){
    int a = 1;
    int memo = 0;
    
    while (a < 1000){

      if (a%3==0 || a%5==0){
        memo += a;
      }
      a ++;
    }
    System.out.println(233168);
    System.out.println(memo);
  }
}