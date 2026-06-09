// Attributes
class StudentProfile {
  String name;
    int age;
    double gpa;

  // Constructor to store the values from users
  StudentProfile(String name, int age, double gpa) {
        this.name = name;
    this.age = age;
    this.gpa = gpa;
    }
    // method
  public void displayInfo() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("GPA: " + gpa);

    }
    // Another method
    public void study() {
        System.out.println(name + " is studying.");
      }
      // Yet another method
      public void takeExam( ) {
        System.out.println(name + " is taking an exam.");
      }

}