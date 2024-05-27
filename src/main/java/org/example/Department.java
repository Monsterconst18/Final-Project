package org.example;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// Lombok generated methods
@ToString
@EqualsAndHashCode
@Getter
@Setter
// Fields
public class Department {
    private String departmentId;
    private String departmentName;
    private static int nextId = 1;

    /**
     * Checks if a department name is valid or not
     * @param departmentName the input
     * @return true or false depending on the department name
     */
    public static boolean validateDepartmentName(String departmentName) {
        boolean isValid = true;
        for (int i = 0; i < departmentName.length(); i++) {
            isValid = Character.isLetter(departmentName.charAt(i))
                    || Character.isSpaceChar(departmentName.charAt(i));
            if (isValid == false)
                return false;
        }
        return true;
    }
    // Constructor that checks if department name is valid
    public Department(String departmentName){
        if (Department.validateDepartmentName(departmentName)){
            this.departmentId = "D" + String.format("%02d" , Department.nextId++);
            this.departmentName = departmentName;
        } else {
            this.departmentId = null;
            this.departmentName = null;
        }
    }
}
