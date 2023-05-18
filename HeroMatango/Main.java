import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> points = new ArrayList<Integer>(); //Integer形でArrayListを宣言
    points.add(10); //自動的にIntegerに変換・格納される
    points.add(80);
    points.add(75); 
    for (int i : points) { //拡張for文(4.45項)も利用可能
      System.out.println(i);
    }
  }
}