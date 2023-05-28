import java.io.*;

public class Main {
  public static void main(String[] args) {
    FileWriter fw = new FileWriter("data.txt"); //FireWriterのコンストラクタはIOExceptionを発生させる可能性があるが、try-catch文を記述していない（失敗時にどうするかを考えていない）
  }
}