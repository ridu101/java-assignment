public class Student {
    private String name;
    private int age;
    private String grade;
    public Student() {
        this.name = "Ridwan Ahmed";
        this.age = 18;
        this.grade = "Freshman";
    }
    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    private void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
    public void promote() {
        if (grade.equals("Freshman")) {
            grade = "Sophomore";
        } else if (grade.equals("Sophomore")) {
            grade = "Junior";
        } else if (grade.equals("Junior")) {
            grade = "Senior";
        } else {
            System.out.println("Cannot promote further.");
        }
    }
    public static void main(String[] args) {
        Student student1 = new Student(); // Using default constructor
        Student student2 = new Student("RIdwan Ahmed", 20, "3.70"); 
        student1.displayInfo(); // Displaying default student information
        System.out.println();
        student2.displayInfo(); // Displaying customized student information
        System.out.println();
        student1.promote(); // Promoting student1 to the next grade
        student1.displayInfo(); // Displaying updated student1 information
    }
}
