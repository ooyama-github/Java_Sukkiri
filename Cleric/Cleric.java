public class Cleric {
  
  String name;
  int hp = 50;
  final int Max_HP = 50;
  int mp = 10;
  final int Max_MP = 10;
  
  public void selfAid() {
    
    System.out.println(this.name + "は、セルフエイドを唱えた！");
    
    this hp = this Max_HP;
    this mp -= 5;
    
    System.out.println(this.name + "は、HPが最大まで回復した");
  }
  
  public int pray(int sec) {
    
    System.out.println(this.name + "は" + sec + "秒感祈るを行った！")
    
    //乱数
    int recover = new Random().nextInt(3) + sec;
    
    //回復量計算
    int recoverActual = Math.min(this.MAX_MP - this.mp, recover);
    
    this.mp += recoverActual;
    System.out.println("MPが" + recoverActual + "回復した");
    return recoverActual;
  }
}