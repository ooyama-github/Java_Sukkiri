public class Main {
  public static void main(String[] args) {
    
    Hero h1 = new Hero("ミナト"); //文字列引数があるのでコンストラクタ１が呼び出される
    System.out.println(h1.name);
    Hero h2 = new Hero(); //引数がないのでコンストラクタ２が呼び出される
    System.out.println(h2.name);
  }
}