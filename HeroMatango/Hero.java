public class Hero extends Character {
  public void attack(Matango m) { //お化けキノコ攻撃用
    System.out.println(this.name + "の攻撃！");
    System.out.ptintln("敵に10ポイントのダメージをあたえた！");
    m.hp -= 10;
  }
  
  public void attack(Goblin g) { //ゴブリン攻撃用
    System.out.println(this.name + "の攻撃！");
    System.out.println("敵に10ポイントのダメージをあたえた！");
    g.hp -= 10;
  }
  
  //以下スライム用など続く
}