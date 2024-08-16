package animalFactories;

import farmAnimals.FarmAnimal;
import farmAnimals.Pig;

public class PigAnimalFactory extends AnimalFactory{
    @Override
    public FarmAnimal createAnimal() {
        return new Pig();
    }
}
