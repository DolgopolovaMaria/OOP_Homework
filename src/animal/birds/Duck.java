package animal.birds;

import animal.Animal;

public class Duck extends Animal implements IFlying {
    @Override
    public void say(){
        System.out.println("Кря");
    }

    public void fly(){
        System.out.println("Я лечу");
    }

    public Duck(String name, int age, String color, int weight){
        super(name, age, color, weight);
    }
}
