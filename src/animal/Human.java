package animal;
//  スーパークラスの継承とインターフェイスを実装
public class Human extends Animal implements Thinkable {
    //  カプセル化した趣味のフィールドを定義
    private String hobby;
    //  名前・年齢・趣味の各変数を格納、引数の情報で初期化
    public Human(String name, int age, String hobby) {
        super(name, age);
        this.hobby = hobby;
    }
    //  Thinkableメソッドの実装
    @Override
    public void think() {
        System.out.println("私は" + this.hobby + "について考えています。");
    }
}
