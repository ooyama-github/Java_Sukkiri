public class Main {
  public static void main(String[] args) {

    String address = "oyama@jp";
    String text = "現在Javaを勉強中です";
    email(address, text);
  }

  public static void email(String address, String text) {
    
    System.out.println(address + "に、以下のメールを送信しました");
    System.out.println("件名：無題");
    System.out.println("本文：" + text);
  }
  
  public static void email(String title, String address, String text) {
    
    System.out.println(address + "に、以下のメールを送信しました");
    System.out.println("件名：" + title);
    System.out.println("本文：" + text);
  }
}