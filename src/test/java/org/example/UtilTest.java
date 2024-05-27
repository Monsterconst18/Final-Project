package org.example;

import org.example.util.Util;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UtilTest {
    // Tests to check if method is robust
    @Test
    public void toTitleCase1() {
        String strIn = "DrEAM TeAm";
        String result = "Dream Team";
        String expectedResult = Util.ToTitleCase(strIn);

        Assertions.assertEquals(result, expectedResult);
    }
    @Test
    public void toTitleCase2() {
        String strIn = "CoNsT KaLaN";
        String result = "Const Kalan";
        String expectedResult = Util.ToTitleCase(strIn);

        Assertions.assertEquals(result, expectedResult);
    }
}
