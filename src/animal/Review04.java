package animal;

import animal.polymorphism.Animal;

public class Review04 {
    public static void main(String[] args) {
        Animal tanaka = new Animal("田中 太郎",25);
        tanaka.say();
        //  趣味:電車
        Animal suzuki = new Animal("鈴木 次郎",30);
        suzuki.say();
        //  趣味:野球
        Animal sato = new Animal("佐藤 花子",20);
        sato.say();
        //  趣味:映画
    }
}