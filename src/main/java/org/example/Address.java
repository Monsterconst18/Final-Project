package org.example;

import lombok.*;


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
        if ((postalCode.length() != 6) && (postalCode.length() != 7))
            return false;
        if (postalCode.length() == 6) {
            return Character.isLetter(postalCode.charAt(0)) && Character.isDigit(postalCode.charAt(1))
                    && Character.isLetter(postalCode.charAt(2)) && Character.isDigit(postalCode.charAt(3))
                    && Character.isLetter(postalCode.charAt(4)) && Character.isDigit(postalCode.charAt(5));
        } else {
            return Character.isLetter(postalCode.charAt(0)) && Character.isDigit(postalCode.charAt(1))
                    && Character.isLetter(postalCode.charAt(2)) && Character.isDigit(postalCode.charAt(4))
                    && Character.isLetter(postalCode.charAt(5)) && Character.isDigit(postalCode.charAt(6))
                    && Character.isSpaceChar(postalCode.charAt(3));
        }
    }
    public Address(int streetNo, String street, String city, String province, String postalCode, String country){
        this.street = street;
        this.streetNo = streetNo;
        this.city = city;
        this.province = province;
        this.country = country;
        if (isPostalCodeValid(postalCode)){
            this.postalCode = postalCode.toUpperCase();
        }
        else{
            this.postalCode = null;
        }
    }
}







