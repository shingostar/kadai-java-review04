package animal;

public class Animal {
    //  フィールド
    private String name; //    氏名
    private int age; // 年齢
    //  コンストラクタ
    public Animal() {
    }
    //  引数ありコンストラクタ
    public Animal(String n,int a) {

        this.setName(n);
        this.setAge(a);
    }

    //  報告するメソッド
    public void say() {
        System.out.println(getName()+"です。"+getAge()+"歳です。");

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

}

