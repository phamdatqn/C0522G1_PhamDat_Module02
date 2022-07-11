package ss07_abstract_class_and_interface.practice.animal_interface_edible.controller;

import ss07_abstract_class_and_interface.practice.animal_interface_edible.model.animal.Animal;
import ss07_abstract_class_and_interface.practice.animal_interface_edible.model.animal.Chicken;
import ss07_abstract_class_and_interface.practice.animal_interface_edible.model.animal.Edible;
import ss07_abstract_class_and_interface.practice.animal_interface_edible.model.animal.Tiger;
import ss07_abstract_class_and_interface.practice.animal_interface_edible.model.fruit.Apple;
import ss07_abstract_class_and_interface.practice.animal_interface_edible.model.fruit.Fruit;
import ss07_abstract_class_and_interface.practice.animal_interface_edible.model.fruit.Orange;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];

        animals[0] = new Tiger();

        animals[1] = new Chicken();

        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howtoEat());
            }
        }
        /** for thường
         * for (int i=0;i< animals.length;i++){
         *             System.out.println(animals[i].makeSound());
         *             if (animals[i] instanceof Chicken) {
         *                 Edible edibler = (Chicken) animals[i];
         *                 System.out.println(edibler.howtoEat());
         *             }
         *         }
         */

        Fruit[] fruits = new Fruit[2];

        fruits[0] = new Orange();

        fruits[1] = new Apple();

        for (Fruit fruit : fruits) {
            System.out.println(fruit.howtoEat());
        }

    }
}
