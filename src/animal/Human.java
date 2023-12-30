package animal;

public class Human implements Thinkable {
    private String think;
    //  コンストラクタ
    public Human() {
    }
    //  引数ありコンストラクタ
    public Human(String think) {
        this.think = think;
    }

    public void think() {
    System.out.println("私は"+think+"について考えています。");
    }
}


