
public class BitMan{
  public static void main(String args[]) {
    // to check while its even or odd number using BitMan
    // or check last bit is set or not
    int n = 4;
    if((n & 1) == 1){
      System.out.println("Odd");
    }
    else{
      System.out.println("Even");
    }

    // what will be the 2^n in O(1) time complexity
    int ans = 1 << n;
    System.out.println("2^" + n + " = " + ans);


    // to set last bit to set
    int setLastBitToSet = 2;
    ans = setLastBitToSet | 1;
    System.out.println(ans);

    // 
  }
}
