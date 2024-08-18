package farmUtensils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogLeashTest {

    @Test()
    void shoud_throw_Argument_exeption_for_use_method_on_empty_argument(){
        FarmUtensils farmUtensil = new DogLeash();
        assertThrows(IllegalArgumentException.class, () -> farmUtensil.use(""));
    }

    @Test()
    void shoud_throw_Argument_exeption_for_use_method_on_less_than_five_length(){
        String NAME_WITH_LESS_THAN_FIVE_CHARS = "test";
        FarmUtensils farmUtensil = new DogLeash();
        assertThrows(IllegalArgumentException.class, () -> farmUtensil.use(NAME_WITH_LESS_THAN_FIVE_CHARS));
    }

    @Test()
    void shoud_throw_Argument_exeption_for_use_method_on_more_than_ten_chars_length(){
        String NAME_WITH_MORE_THAN_FIVE_CHARS = "test-test-t";
        FarmUtensils farmUtensil = new DogLeash();
        assertThrows(IllegalArgumentException.class, () -> farmUtensil.use(NAME_WITH_MORE_THAN_FIVE_CHARS));
    }

}