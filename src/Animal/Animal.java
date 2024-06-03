package Animal;

import java.util.Set;

public class Animal {
    private String name;
    private int age;
    private int weight;
    private String color;

    // лет  0.5.6.7.8.9
    // года 2.3.4
    private static final Set<Integer> years = Set.of(0, 5, 6, 7, 8, 9);
    private static final Set<Integer> year = Set.of(2, 3, 4);

    public Animal(String name, int age, int weight, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

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

    void say() {
        System.out.println("Я говорю");
    }

    void go() {
        System.out.println("Я иду");
    }

    void eat() {
        System.out.println("Я ем");
    }

    void drink() {
        System.out.println("Я пью");
    }

    @Override
    public String toString() {
        return "Привет! меня зовут " + name + ", мне " + age + " " + years() + ", я вешу - " + weight + " кг, мой цвет - " + color;
    }

    private String years(){
        String result = "год";
        if (age % 10 == 0 || years.contains(age) || years.contains(age % 10) || age == 11) {
            result = "лет";
        } else if (year.contains(age) || year.contains(age % 10)) {
            result = "года";
        }
        return result;
    }
}