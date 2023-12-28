package animal;

public class Human extends Animal {
    public void getThink(String think){

    }

    public void setThinkzble(String think) {
        this.setThink(think);}


    public void say() {
        System.out.println(getName()+"です。"+getAge()+"歳です。");
    }


    public void setThink(String think) {
        System.out.println("私は"+think+"のことを考えています。");
    }
}


