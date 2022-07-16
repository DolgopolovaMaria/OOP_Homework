package animal.pets;

import animal.Animal;

public class Dog extends Animal {
    @Override
    public void say(){
        System.out.println("Гав");
    }

    public Dog(String name, int age, String color, int weight){
        super(name, age, color, weight);
    }
}
