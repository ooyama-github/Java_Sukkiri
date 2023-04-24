public class SuperHero {
  Stirng name = "ミナト";
  int hp = 100;
  boolean flying; //flyingフィールドを追加
  
  //戦う
  public void attack(Matango m) {
    System.out.println(this.name + "の攻撃！")
    m.hp -= 5;
    System.out.println("5ポイントのダメージをあたえた！");
  }
  
  //逃げる
  public void run() {
    System.out.println(this.name + "は逃げ出した！");
  }
  
  //飛ぶ fly()を追加
  public void fly() {
    this.flying = true;
    System.out.println("飛び上がった！");
  }
  
  //着地する　land()を追加
  public void land() {
    this.flying = false;
    System.out.println("着地した！");
  }
}