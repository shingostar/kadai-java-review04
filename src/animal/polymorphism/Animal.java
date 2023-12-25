package animal.polymorphism;

public class Animal {
    //  フィールド
    private String name; //    氏名
    private int age; // 年齢
    //  コンストラクタ
    public Animal() {
    }
    //  引数ありコンストラクタ
    public Animal(String name,int age) {
        this.name = name;
        this.age = age;
    }

    //  報告するメソッド
    public void say() {
        System.out.println(name+"です。"+age+"歳です。");
    }
}