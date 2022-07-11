package ss07_abstract_class_and_interface.practice.animal_interface_edible.model.animal;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howtoEat() {
        return "Có thể chiên, nướng muối ớt";
    }
}
