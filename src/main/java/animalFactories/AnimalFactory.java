package animalFactories;

import farmAnimals.FarmAnimal;
import farmUtensils.FarmUtensils;

public abstract class AnimalFactory {

    public abstract FarmAnimal createAnimal();
    public abstract FarmUtensils createUtensil();
}
