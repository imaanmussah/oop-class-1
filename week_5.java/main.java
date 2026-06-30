public class main {
    public static void main(String[] args) {
        student s = new student();
        s.setstudentID("20250501518");
        s.setname("Imaan");
        s.setcgpa(3.7);
        s.setprogramme("BIT");

        System.out.println("Student ID: " + s.getstudentID());
        System.out.println("Name: " + s.getname());
        System.out.println("CGPA: " + s.getcgpa());
        System.out.println("Programme: " + s.getprogramme());
    }
}
