//2つの値を比較して大きい方の数値を代入する
// int m = Math.max(①,②);

public class Main {
  public static void main(String[] args) {
    
    int a = 5;
    int b = 3;
    int m = Math.max(a, b);
    
    System.out.println("比較実験：" + a + "と" + b + "とで大きい方は..." + m);
  }
}