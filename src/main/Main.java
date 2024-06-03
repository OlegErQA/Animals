package main;

import Animal.Animal;
import Animal.Cat;
import Animal.Dog;
import Animal.Duck;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Animal> animal  = new ArrayList<>();
        Animal Dog;
        Animal Cat;
        Animal Duck;

        Scanner scan = new Scanner(System.in);

        boolean menu = true;
        while (menu) {
            System.out.println("Меню");
            System.out.println("Введите add для добавления");
            System.out.println("Введите list для печати списка");
            System.out.println("Введите exit для выхода");

            String input = scan.next().toUpperCase(Locale.ROOT).trim();

            Command command = Command.of(input);
            switch (command) {
                case Command.ADD -> {
                    System.out.println("Выберите животное: cat/dog/duck");
                    input = scan.next();

                    String name;
                    int age;
                    int weight;
                    String color;

                    System.out.println("Введите имя животного");
                    name = scan.next();
                    System.out.println("Введите возраст животного");
                    age = Integer.parseInt(scan.next());
                    System.out.println("Введите вес животного");
                    weight = Integer.parseInt(scan.next());
                    System.out.println("Введите цвет животного");
                    color = scan.next();

                    Animal animals;
                    switch (input) {
                        case "cat" -> animals = new Cat(name, age, weight, color);
                        case "dog" -> animals = new Dog(name, age, weight, color);
                        case "duck" -> animals = new Duck(name, age, weight, color);
                        default -> {
                            System.out.println("Неверный выбор");
                            animals = null;
                        }
                    }
                    if (animal != null) {
                        animal.add(animals);
                        System.out.println("Животное добавлено");
                    }
                }
                case Command.LIST -> animal.forEach(System.out::println);
                case Command.EXIT -> {
                    System.out.println("Выход из программы");
                    menu = false;
                }
                default -> System.out.println("Неверное значение");
            }
        }
        System.out.println("Выход произведен...");
    }
}