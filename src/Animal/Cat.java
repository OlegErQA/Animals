package Animal;

public class Cat extends Animal{

    public Cat(String name, int age, int weight, String color) {
        super(name, age, weight, color);
    }

    @Override
    void say() {
        System.out.println("Мяу");
    }
}