package animal;

public class Animal {
    //  カプセル化したフィールドの定義
    private String name; //    氏名
    private int age; // 年齢

    // 引数なしのコンストラクタ
    public Animal() {
    }

    //  引数ありのコンストラクタ
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //  戻り値なしのsayメソッドの定義
    public void say() {
        System.out.println(this.name + "です。" + this.age + "歳です。");
    }
}
