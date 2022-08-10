public class Solution{
  public static void int printSum(int a, int b, int c){
    int sum = 0;
    if (a%2 == 0 && b % 2 != 0 && c % 2 == 0){
      sum = a + b - c;
    }
    return sum;
  }
  
  public static void main(String[] args){
    System.out.println(printSum(4,3,2));
  }
}
