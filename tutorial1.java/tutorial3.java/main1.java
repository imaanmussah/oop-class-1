public class main1 {
    public static void main(String[] args) {
        person p = new person("john", "S001");
        student s = new student("jane", "S002");
        lecturer l = new lecturer("Dr. Smith", "L456");

        p.introduce();
        s.introduce();
        l.introduce();
    }
}
