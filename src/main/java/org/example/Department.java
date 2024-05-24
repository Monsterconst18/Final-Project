package org.example;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@Getter
@Setter
public class Department {
    private String departmentId;
    private String departmentName;
    private static int nextId;

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
}
