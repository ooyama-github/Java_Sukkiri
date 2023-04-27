public class Computer extends TangibleAsset {
  String makerName;
  public Computer(String name, int price, String color, String makerName) {
    super(name, price, color);
  }
  
  public String getMakerName() {
    return this.makerName;
  }
}