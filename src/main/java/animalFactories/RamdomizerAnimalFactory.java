package animalFactories;

import farmAnimals.Dog;
import farmAnimals.FarmAnimal;
import farmAnimals.Hen;
import farmAnimals.Pig;

import java.util.ArrayList;
import java.util.List;

public class RamdomizerAnimalFactory extends AnimalFactory {
    final int HEN = 0;
    final int DOG = 1;
    final int PIG = 2;
    @Override
    public FarmAnimal createAnimal() {
        int randomNumber = getRandomNumber(0, 3);

        return switch (randomNumber) {
            case HEN -> new Hen();
            case DOG -> new Dog();
            case PIG -> new Pig();
            default -> null;
        };
    }

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
