import java.util.Date; //importしておくと便利

public class Main {
  public static void main(String[] args) {
    Date now = new Date(); //現在の日時を取得
    System.out.println(now);
    System.out.println(now.getTime());
    Date past = new Date(1600705425827L);
    System.out.println(past);
  }
}