public class Hero {
    String name;
    int hp;
    static int money; //静的フィールド
}

//同じクラスから生成されたインスタンスでフィールドを共有したい場合には、フィールド宣言の先頭にstaticキーワードを追加します