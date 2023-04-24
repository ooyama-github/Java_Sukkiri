public class SuperHero extends Hero { //extends Heroは「基本的にはHeroと同じと宣言」という意味

  boolean flying; //追加したflying
  public void fly() { //追加したfly()
    this.flying = true;
    System.out.println("飛び上がった！");
  }
  
  public void land() { //追加したland()
    this.flying = false;
    System.out.println("着地した！");
  }
}


ポイントは、1行目のextendsです。「class SuperHero extends Hero」という宣言は、「HeroクラスをベースにしてSuperHeroクラスを定義するので、Heroと同じメンバの定義は省略します（違いだけ記述します）」という意味になります