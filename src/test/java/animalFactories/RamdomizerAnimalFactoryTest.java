package animalFactories;

import farmAnimals.Dog;
import farmAnimals.FarmAnimal;
import farmAnimals.Hen;
import farmAnimals.Pig;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class RamdomizerAnimalFactoryTest {

    AnimalFactory randomFactory;
    RamdomizerAnimalFactory ramdomizerAnimalFactory;
    private int min;
    private int max;
    @BeforeEach
    public void GenerateRandomClass(){
        randomFactory = new RamdomizerAnimalFactory();
        ramdomizerAnimalFactory = new RamdomizerAnimalFactory();
        min = 0;
        max = 3;
    }

    @Test
    void should_return_random_animal_instance() {
        FarmAnimal randomAnimal = randomFactory.createAnimal();
        assertTrue(randomAnimal instanceof Dog || randomAnimal instanceof Hen || randomAnimal instanceof Pig);
    }

    @Test
    void should_get_random_number_between_zero_and_two() {
        int randomNumber = ramdomizerAnimalFactory.getRandomNumber(min, max);
        assertTrue(randomNumber < 3);
        assertTrue(randomNumber >= 0);
    }
}