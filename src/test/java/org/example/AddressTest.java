package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddressTest {
    // Tests to check if method is robust
    @Test
    public void isPostalCodeValid1() {
        String postalCode = "H4R 3K6";
        boolean expectedResult = true;
        boolean result = Address.isPostalCodeValid(postalCode);

        Assertions.assertTrue(result);
    }
    @Test
    public void isPostalCodeValid2() {
        String postalCode = "E43v2";
        boolean expectedResult = false;
        boolean result = Address.isPostalCodeValid(postalCode);

        Assertions.assertFalse(result);
    }
    @Test
    public void isPostalCodeValid3() {
        String postalCode = "E46FS2";
        boolean expectedResult = false;
        boolean result = Address.isPostalCodeValid(postalCode);

        Assertions.assertFalse(result);
    }
    @Test
    public void isPostalCodeValid4() {
        String postalCode = "W4E5T2";
        boolean expectedResult = true;
        boolean result = Address.isPostalCodeValid(postalCode);

        Assertions.assertTrue(result);
    }
}
