package animal;

import animal.birds.Duck;
import animal.pets.Cat;
import animal.pets.Dog;

public class AnimalFactory {
    public static Animal create(AnimalType animalType, String name, int age, String color, int weight){
        switch(animalType){
            case CAT:
                return new Cat(name, age, color, weight);
            case DOG:
                return new Dog(name, age, color, weight);
            case DUCK:
                return new Duck(name, age, color, weight);
        }
        return null;
    }
}
