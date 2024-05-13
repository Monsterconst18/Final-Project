package org.example;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

@EqualsAndHashCode
@Getter
@Setter
public class Student {
    private String studentId;
    private String studentName;
    private Gender gender;
    private Address address;
    private Department department;
    private Course[] registeredCourse;
    private static int nextId;

    /**
     * registers a course, add the course to the student's registeredCourses list, and add the student to the course's
     * registeredStudents list. If the course is already registered, directly returns `false`
     * @param course the registered course
     * @return the course that you register for
     */
    public boolean registerCourse(Course course) {
        //TODO: To be implemented
        return false;
    }

    /**
     * drops a course, remove the course from the student's registeredCourses list, and remove the student from the course's registeredStudents list.
     * If the course is not registered yet, directly returns `false`
     * @param courseId the Id of the course you drop
     * @return the course that you drop
     */
    public boolean dropCourse(String courseId) {
        //TODO: To be implemented
        return true;
    }

    /**
     * Creates a student with `studentId` automatically generated
     * based on the `nextId`, and `registeredCourses` as empty object
     * @param studentName the name of student
     * @param gender the student's gender
     * @param department the department of a student
     * @return the details of the student
     */
    public Student(String studentName, String gender, Department department) {
        //TODO: To be implemented
    }

    /**
     * Converts a student to a simple string
     * with only the `studentId`, the `studentName`, and `departmentName`
     * @return the simplified string
     */
    public String toSimplifiedString() {
        //TODO: To be implemented
        return "str";
    }

    /**
     * Converts a student to a string that contains
     * the `studentId`, the `studentName`, the `gender`, the `address` and the `department`, and the `registeredCourses`
     * @return the full details of the student
     */

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", studentName='" + studentName + '\'' +
                ", gender=" + gender +
                ", address=" + address +
                ", department=" + department +
                ", registeredCourse=" + Arrays.toString(registeredCourse) +
                '}';
    }
}

