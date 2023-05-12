public class Hero {
    String name;
    int hp;
    static int money;
    
    public static void setRandomMoney() { //staticを付けたメソッド
        Hero.money = (int) (Math.random() * 1000);
    }
}