public class Course {
    private String courseName;
    private int courseCode;
    private int numberOfStudents;
    private boolean isOpen;
    public Course() {
        this.courseName = "Introduction to Programming";
        this.courseCode = 101;
        this.numberOfStudents = 0;
        this.isOpen = false;
    }
    public Course(String name, int code, int students, boolean open) {
        this.courseName = name;
        this.courseCode = code;
        this.numberOfStudents = students;
        this.isOpen = open;
    }
    public void enrollStudent() {
        numberOfStudents++;
        System.out.println("One student enrolled in " + courseName);
    }
    public void displayCourseInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Code: " + courseCode);
        System.out.println("Number of Students: " + numberOfStudents);
        System.out.println("Course is Open: " + isOpen);
    }
    private void openCourse() {
        isOpen = true;
        System.out.println(courseName + " is now open for enrollment.");
    }
    private void closeCourse() {
        isOpen = false;
        System.out.println(courseName + " is now closed for enrollment.");
    }
    public static void main(String[] args) {
        Course defaultCourse = new Course(); // Using default constructor
        Course customCourse = new Course("Data Structures", 201, 30, true);
        defaultCourse.displayCourseInfo();
        defaultCourse.enrollStudent();
        defaultCourse.openCourse();
        System.out.println();
        customCourse.displayCourseInfo();
        customCourse.enrollStudent();
        customCourse.closeCourse();
    }
}
