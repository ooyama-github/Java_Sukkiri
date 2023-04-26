public class Dancer extends Character { //Characterは抽象クラス
  
  public void dance() {
    System.out.println(this.name + "は情熱的に踊った");
  }
  
  //attack()をオーバーライドし忘れている1
}