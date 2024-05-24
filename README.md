# Final-Project
This project contains all the source code and dependencies that I will use for each of the classes. Git Bash will be used to update my repository with several commits. 

For the first class named Address, the fields include:
1. int streetNo: the street number
2. String street: the street name
3. String city: the name of city
4. String province: The name of province
5. String postalCode: The postal code
6. String country: The country

There is a static boolean method named isPostalCodeValid with a String parameter of postalCode to check if a postal code is valid or not. The lombok dependency is a useful to get the all args constructor, the toString method, the equals method and the getters and setters instead of writing all the code for those methods. This way, the code will be more clean. 

For the second class named Department, the following fields are:
1. String departmentId: Contains 2 digits and must start with character 'D'
2. String departmentName: The name of department
3. static int nextID: An indication of the next ID that will be used

This class contains a static boolean method named validateDepartmentName with a String parameter of departmentName to check if a department name is valid or not. There is a constructor used only if the department name is invalid and returns null for everything which is an indicator of an invalid department name. The lombok dependency is also set for this class to include the toString method, equals method and the getters and setters. This dependency is not only set for a single class. It is set for all classes in the project file.

For the third class named Student, the following fields are:
1. String studentId: A 6-digit ID for each student and must start with 'S'
2. String studentName: The name of the student
3. Gender gender: The student's gender
4. Address address: The student's address
5. Department department: The student's department
6. Course[]/ArrayList<Course> registeredCourses: A list of registered courses
7. static int nextId: Indicates the next ID that will be used by each student

In this class, there is a boolean method named registerCourse with a Course parameter of course. This method adds a certain course to the student's registered course list and to the course's registered students list. It also checks if a course is registered or not. 
There is an opposite boolean method called dropCourse with the same parameters as the registerCourse method. This method removes a course from the student's registered course list and from the course's registered student list. The constructor with arguments such as studentName, gender, address, and department creates a student ID based on the next ID and registered courses. There is a toSimplifiedString method that combines the student ID, student name and department name into one string. The toString method has to be coded because not all the fields are used in this method. Lombok is only used for the equals method and for the getters and setters in this class.

For the fourth class named Assignment, the fields are:
1. String assignmentId : The ID of an assignment
2. String assignmentName: The name of an assignment
3. double weight: The weight of each assignment
4. int maxScore: The highest score out of all assignments
5. double assignment average: The overall average of all assignments
6. int[] scores: A list of all assignment scores
7. static int nextId: The next ID that will be used

In this class, there is a void method named calcAssignmentAvg which calculates the average score for a single assignment. There is a void method named generateRandomScore that generates random scores for all students in range (0-10) to generate a random score for each student's assignment. 
Here is a representation of all the numbers in this range:
1. 0: Generate a random score in range [0, 60)
2. 1, 2: Generate a random score in range [60, 70)
3. 3, 4: Generate a random score in range [70, 80)
4. 5, 6, 7, 8: Generate a random score in range [80, 90)
5. 9, 10: Generate a random score in range [90, 100]

Since the toString method only contains assignmentId, assignmentName, weight and maxScore it has to be coded. 

For the fifth class named Course, the fields include:
1. String courseId: The course ID in the following format: C-departmentId-twoDigitCourseId
2. String courseName: The name of the course
3. double credits: The credits for each course
4. Department department: The department for each course
5. Assignment[]/ArrayList<Assignment> assignments: A list of assignments for each course
6. Student[]/ArrayList<Student> registeredStudents: A list of students registered for a specific course
7. double[]/ArrayList<Double> finalScores: A list of final scores for each course
8. static int nextId: Like mentioned in other classes, indicates the next ID that will be used

There is a boolean named isAssignmentWeightValid() that checks if the sum of all the weights of all assignments gives 100%.
There is a boolean method named registerStudent with a Student parameter of student that adds the student to the course list after registering for that course.
The int[] method named calcStudentAverage() calculates the average score of a student in a certain course.
For the boolean method named addAssignment with a String parameter of assignmentName, double parameter of weight and int parameter of maxScore. This method adds an assignment to the course as the Semester progresses.
The void method named generateScores() generates random scores for each student to calculate the final score.
The void method named displayScores() 



