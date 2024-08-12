package farmAnimlas;

public class Dog implements FarmAnimal {

    private final short paws = 7;
    private final boolean canFly = false;
    private final short yearsOld = 5;
    @Override
    public short getPawsAmount() {
        return paws;
    }

    @Override
    public boolean canFly() {
        return canFly;
    }

    @Override
    public short getYearsOld() {
        return yearsOld;
    }
}
