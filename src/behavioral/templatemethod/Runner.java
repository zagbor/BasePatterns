package behavioral.templatemethod;

public class Runner {
    public static void main(String[] args) {
        Human human = new Unemployed();
        Human human1 = new Worker();

        System.out.println("------------------------");
        human.templateBehavioral();
        System.out.println("------------------------");
        human1.templateBehavioral();
    }

}
