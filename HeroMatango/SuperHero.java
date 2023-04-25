public class SuperHero extends Hero {
  
  boolean flying; //新規追加したフィールド
  public void fly() { //新規追加したメソッド
    this.flying = true;
    System.out.println("飛び上がった！");
  }
  
  public void land() { //新規追加したメソッド
    this.flying = false;
    System.out.println("着地した！");
  }
  
  public void run() { //親クラスにも定義してあるが、子クラスで再定義（上書き）するメソッド
    System.out.println(this.name + "は撤退した");
  }
}