package farmAnimlas;

import farmAnimlas.FarmAnimal;

public class Hen implements FarmAnimal {
    private final short paws = 2;
    private final boolean canFly = true;
    private final short yearsOld = 4;

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
