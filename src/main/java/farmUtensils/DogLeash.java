package farmUtensils;

public class DogLeash implements FarmUtensils{
    private final int MIN_NAME_LENGTH = 5;
    private final int MAX_NAME_LENGTH = 10;
    @Override
    public void use(String auxInformation) {
        if(auxInformation.isEmpty() ||
                auxInformation.length() < MIN_NAME_LENGTH ||
                auxInformation.length() > MAX_NAME_LENGTH)
            throw new IllegalArgumentException();
        StringBuilder useMessage = new StringBuilder();
        useMessage.append("This Leash belogs to the dog with the name: ")
                .append(auxInformation);
        System.out.println(useMessage.toString());
    }

    @Override
    public void displayDescription(String auxInformation) {
        System.out.println("This is a leash for dogs only.");
    }
}
