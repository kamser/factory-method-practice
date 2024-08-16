import animalFactories.AnimalFactory;
import animalFactories.RamdomizerAnimalFactory;
import farmAnimals.FarmAnimal;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    private final static int ANIMALS_NUMBER = 10;
    AnimalFactory animalFactory;
    List<FarmAnimal> animals = new ArrayList<>();
    Farm(AnimalFactory animalFactory){
        this.animalFactory = animalFactory;
    }

    List<FarmAnimal> generateAnimals(){

        for(int i = 0; i < ANIMALS_NUMBER; i++){
            animals.add(animalFactory.createAnimal());
        }
        return animals;
    }


    void listAnimals(){
       for (int i = 0; i < ANIMALS_NUMBER; i++){
           FarmAnimal currentAnimal = animals.get(i);
           System.out.println("I'm a: " + currentAnimal.getMySpecies());
           System.out.println("I have these amount of paws: " + currentAnimal.getPawsAmount());
           if (currentAnimal.canFly()) {
               System.out.println("I can fly");
           } else {
               System.out.println("I can not fly");
           }
           System.out.println("I am: " + currentAnimal.getYearsOld() + " years old");

           System.out.println("===================================");

       }
    }

    public static void main(String[]args){
        Farm farm = new Farm(new RamdomizerAnimalFactory());
        farm.generateAnimals();
        farm.listAnimals();
    }
}
