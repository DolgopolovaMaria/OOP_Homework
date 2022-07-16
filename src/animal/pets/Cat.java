package animal.pets;

import animal.Animal;

public class Cat extends Animal {
    @Override
    public void say(){
        System.out.println("Мяу");
    }

    public Cat(String name, int age, String color, int weight){
        super(name, age, color, weight);
    }
}
