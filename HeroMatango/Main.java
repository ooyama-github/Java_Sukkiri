public class Main {
  public static void main(String[] args) {
    
    Sword s = new Sword();
    s.name = "炎の剣";
    s.damage = 10;
    
    Hero h = new Hero();
    h.name = "ミナト";
    h.hp = 100;
    h.sword = s; //swordフィールドに生成済みの剣インスタンス（の番地）を代入
    
    System.out.println("現在の武器は" + h.sword.name); //h(勇者).（の）sword(剣).(の)name(名前)
    System.out.println(h.name + "は" + h.sword.name + "で攻撃した！");
  }
}