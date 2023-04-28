public class Main {
  public static void main(String[] args) {
    
    // Hero2人を作る
    Hero h1 = new Hero();
    Hero h2 = new Hero();
    //Thief1人を作る
    Thief t1 = new Thief();
    //Wizard2人を作る
    Wizard w1 = new Wizard();
    Wizard w2 = new Wizard();
    
    //冒険開始！　まず宿屋に泊まる
    h1.hp += 50;
    h2.hp += 50;
    t1.hp += 50;
    w1.hp += 50;
    w2.hp += 50;
  }
}

// このコードの前提
// ・HeroやWizard、Thiefは、抽象クラスCharacterを継承している。
// ・Characterはnameとhpフィールド、attack()とrun()メソッドを持つ。