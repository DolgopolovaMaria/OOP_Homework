package animal;

public abstract class Animal {

    private String name;
    private int age;
    private int weight;
    private String color;

    public Animal(String name, int age, String color, int weight) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.weight = weight;
    }

    public Animal() {}

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void say(){
        System.out.println("Я говорю");
    }

    public void go(){
        System.out.println("Я иду");
    }

    public void drink(){
        System.out.println("Я пью");
    }

    public void eat(){
        System.out.println("Я ем");
    }

    public String getAgeString(){
        if ((age % 10) == 1){
            return age + " год";
        }
        if ((age % 10) == 0){
            return age + " лет";
        }
        if (((age % 10) < 5) && ((age / 10) != 1)){
            return age + " года";
        }
        return age + " лет";
    }

    @Override
    public String toString() {
        return "Привет!" +
                " Меня зовут " + name + ", " +
                "мне " + getAgeString() + "," +
                " я вешу - " + weight + " кг," +
                " мой цвет - " + color;
    }
}
