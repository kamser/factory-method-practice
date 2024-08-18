package animalFactories;

import farmAnimals.FarmAnimal;
import farmAnimals.Pig;
import farmUtensils.FarmUtensils;
import farmUtensils.PorkFoodBag;

public class PigAnimalFactory extends AnimalFactory{
    @Override
    public FarmAnimal createAnimal() {
        return new Pig();
    }

    @Override
    public FarmUtensils createUtensil() {
        return new PorkFoodBag();
    }

}
