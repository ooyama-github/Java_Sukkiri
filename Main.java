// キーボードから１行の入力を受けとる命令
// String s = new java.util.Scanner(System.in).nextLine();

// キーボードから１つの整数を入力を受け付ける
// int input = new java.util.Scanner(System.in).nestInt();

public class Main {
  public static void main(String[] args) {
    
    System.out.println("あなたの名前を入力して下さい。");
    
    String name = new java.util.Scanner(System.in).nextLine();
    
    System.out.println("あなたの年齢を入力して下さい。");
    
    int age = new java.util.Scanner(System.in).nextInt();
    
    System.out.println("ようこそ、" + age + "歳の" + name + "さん");
  } 
}