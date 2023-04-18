public class Main {
  public static void main(String[] args) {

    String title = "プログラミングについて";
    String address = "oyama@jp";
    String text = "現在Javaを勉強中です";
    email(title, address, text);
  }

  public static void email(String title, String address, String text) {
    
    System.out.println(address + "に、以下のメールを送信しました");
    System.out.println("件名：" + title);
    System.out.println("本文：" + text);
  }
}