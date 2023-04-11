//拡張for文で配列を回す
//for (要素の型　任意の変数名 ； 配列変数名)

public class Main {
  public static void main(String[] args) {
    
    int[] scores = {20, 30, 40, 50, 80};
    
    for (int value : scores) {
      System.out.println(value);
    }
  }
}