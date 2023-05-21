import java.util.*;

public class Main {
  public static void main(String[] args)  {
    Map<String, Integer> prefs = new HashMap<String, Integer>();
    prefs.put("京都府", 255);
    prefs.put("東京都", 1261);
    prefs.put("熊本県", 182);
    for (String key : prefs.keySet()) { //件名一覧を取得し繰り返す
      int value = prefs.get(key); //件名（キー）を指定し人口（値）を取得
      System.out.println(key + "人口は、" + value);
    }
  }
}