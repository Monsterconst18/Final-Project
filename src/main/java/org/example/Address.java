package org.example;

import lombok.*;

@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Getter
@Setter
public class Address {
    private int streetNo;
    private String street;
    private String city;
    private String province;
    private String postalCode;
    private String country;

    /**
     * Checks if postal code is valid
     * @param postalCode the input
     * @return the postal code at a specific length
     */
    public static boolean isPostalCodeValid(String postalCode) {
        //TODO: to be implemented
        return false;
    }
//        char character = 'C';
//        char digit = 'D';
//        int length;
//        if (length == 6) {
//            postalCode = "CDCDCD";
//        if (length == 7) {
//            postalCode = "CDC DCD";
//        }
//        return postalCode;
//        }
    }


