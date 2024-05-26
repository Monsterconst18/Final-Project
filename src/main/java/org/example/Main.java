package org.example;

import org.example.util.Util;

public class Main {
    public static void main(String[] args) {
        System.out.println(Address.isPostalCodeValid("H4p3K6"));
        System.out.println(Department.validateDepartmentName("dsjkkswk    4wemd"));
        System.out.println(Util.ToTitleCase("fGjK lKaM"));

        Department department1 = new Department("Science");
        Department department2 = new Department("Math");



        Address address1 = new Address(3750, "Lake", "Montreal", "QC", "H4R 4t4", "Canada");
        Address address2 = new Address(45, "Manuel", "Montreal", "QC", "H3T 4t4", "Canada");

        Student student1 = new Student("Cos" , Gender.MALE, address1 , department1);
        Student student2 = new Student("Anna" , Gender.FEMALE, address2 , department2);



        System.out.println(student1);
        System.out.println(student2);



    }
}