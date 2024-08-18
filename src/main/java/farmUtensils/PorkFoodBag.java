package farmUtensils;

public class PorkFoodBag implements FarmUtensils{
    @Override
    public void use(String auxInfo) {
        try{
            int pigsNumber= Integer.parseInt(auxInfo);

            int kilogramsPerPork = 2;

            int totalKilograms = pigsNumber * kilogramsPerPork;

            System.out.println("The Size of the food bag is: " + totalKilograms);

        } catch (RuntimeException re){
            System.out.println("Somehitng wrong happend with the argument value");
        }
    }

    @Override
    public void displayDescription(String auxInfo) {
        System.out.println("This is a Pork Food bag and only has to be used by pigs");
    }
}
