package org.example;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
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
    private ArrayList<Course> registeredCourses;
    private static int nextId = 1;

    /**
     * Checks if a student is registered for a specific course
     * @param course the registered course
     * @return the course that the student registered for
     */
    public boolean registerCourse(Course course) {
        if (registeredCourses.contains(course)) {
            return false;
        } else {
            registeredCourses.add(course);
            course.registerStudent(this);
            return true;
        }

    }

    /**
     * Checks if a student dropped a specific course
     * @param course the dropped course
     * @return the course that the student dropped
     */
    public boolean dropCourse(Course course) {
      if (registeredCourses.contains(course)) {
          registeredCourses.remove(course);
          course.getRegisteredStudents().remove(this);
          return true;
        } else {
            return false;
        }
    }
    /**
     * Creates a student
     * @param studentName the name of the student
     * @param gender the student's gender
     * @param department the student's department
     */
    public Student(String studentName, Gender gender, Department department) {
        this.studentId = this.studentId = "S" + String.format("%06d" , Student.nextId++);
        this.studentName = studentName;
        this.gender = gender;
        this.department = department;

    }

    /**
     * Converts a student to a simple string
     * @return the simplified string
     */
    public String toSimplifiedString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", studentName='" + studentName + '\'' +
                ", department=" + department +
                '}';
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", studentName='" + studentName + '\'' +
                ", gender=" + gender +
                ", address=" + address +
                ", department=" + department +
                ", registeredCourses=" + registeredCourses +
                '}';
    }
}


