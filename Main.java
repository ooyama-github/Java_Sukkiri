// 文字列を数値に変換する
// int n = Integer.perseInt

public class Main {
  public static void main(String[] args) {
    
    String age = "31";
    int n = Integer.parseInt(age);
    
    System.out.println("あなたは来年、" + (n + 1) + "歳になりますね。");
  }
}