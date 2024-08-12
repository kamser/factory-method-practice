package farmAnimlas;

import farmAnimlas.FarmAnimal;

public class Pig implements FarmAnimal {

    private final short paws = 4;
    private final boolean canFly = false;
    private final short yearsOld = 10;
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
