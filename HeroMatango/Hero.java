//次にHeroクラスを定義する
public class Hero {
  
  String name;
  int hp;
  Sword sword; //勇者が装備している剣の情報
  
  public void attack() {
    
    System.out.println(this.name + "は攻撃した");
    System.out.println("敵に5ポイントのダメージをあたえた！");
  }
  
  public Hero(String name) { //コンストラクタ１
    this.hp = 100; 
    this.name = name;
  }
  
  public Hero() {
    
    this.Hero("ダミー"); //コンストラクタ２
  }
}