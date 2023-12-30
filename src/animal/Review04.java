package animal;

public class Review04 {
    public static void main(String[] args) {
        Animal animal01 = new Animal("田中 太郎",25);
        animal01.say();
        Human human01 = new Human("電車");
        human01.think();
        Animal animal02 = new Animal("鈴木 次郎",30);
        animal02.say();
        Human human02 = new Human("野球");
        human02.think();
        Animal animal03 = new Animal("佐藤 花子",20);
        animal03.say();
        Human human03 = new Human("映画");
        human03.think();
    }
}