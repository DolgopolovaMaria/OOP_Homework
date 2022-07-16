import animal.Animal;
import animal.AnimalFactory;
import animal.AnimalType;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    private  static Scanner scan = new Scanner(System.in);

    private static void addAnimal(ArrayList<Animal> animalList){
        boolean added = false;
        while (!added){
            System.out.println("Enter kind od animal");
            String s = scan.next();
            String kind = s.trim().toUpperCase(Locale.ROOT);

            AnimalType animalType = null;

            try {
                switch (AnimalType.valueOf(kind)){
                    case CAT:
                        animalType = AnimalType.CAT;
                        break;
                    case DOG:
                        animalType = AnimalType.DOG;
                        break;
                    case DUCK:
                        animalType = AnimalType.DUCK;
                        break;
                }
            }
            catch (Exception e){
                System.out.println("You entered the wrong kind. Available kinds: dog, cat, duck");;
            }

            if (animalType != null){
                System.out.println("Enter name");
                String name = scan.next();
                System.out.println("Enter age");
                int age = readNumber();
                System.out.println("Enter color");
                String color = scan.next();
                System.out.println("Enter weight");
                int weight = readNumber();
                Animal newAnimal = AnimalFactory.create(animalType, name, age, color, weight);
                animalList.add(newAnimal);
                added = true;
            }
        }

    }

    private static void listAnimal(ArrayList<Animal> animalList){
        System.out.println("Animals:");
        Stream<Animal> stream = animalList.stream();
        stream.forEach(System.out::println);
    }

    private static int readNumber(){
        boolean enteredNumber = false;
        int n = 0;
        while (!enteredNumber){
            try {
                n = Integer.valueOf(scan.next());
                enteredNumber = true;
            }
            catch (Exception e){
                System.out.println("Please enter a number");
            }
        }
        return n;
    }

    private static Commands getCommand(){
        System.out.println("Enter command (add/list/exit)");
        Commands command = null;
        while (command == null){
            try {
                String s = scan.next();
                command = Commands.valueOf(s.trim().toUpperCase());;
            }
            catch (Exception e){
                System.out.println("Please enter a correct command (add/list/exit)");
            }
        }
        return command;
    }

    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        Commands c = null;
        while (c != Commands.EXIT){
            c = getCommand();
            switch (c){
                case ADD:
                    addAnimal(animals);
                    break;
                case LIST:
                    listAnimal(animals);
                    break;
                default:
                    break;
            }
        }
    }
}
