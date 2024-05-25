package org.example;

import org.example.util.Util;

public class Main {
    public static void main(String[] args) {
        System.out.println(Address.isPostalCodeValid("H4p3K6"));
        System.out.println(Department.validateDepartmentName("dsjkkswk    4wemd"));
        System.out.println(Util.ToTitleCase("fGjK lKaM"));

        System.out.println(new Student("Cos" , Gender.MALE, new Department("dep dep")));
        System.out.println(new Student("Anna" , Gender.FEMALE, new Department("dephhh dep")));


    }
}