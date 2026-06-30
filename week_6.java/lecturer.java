public class lecturer extends Employee {
    private String subject;
    private String department;

    public lecturer(String id, String name, String subject, String department) {
        super(id, name);
        this.subject = subject;
        this.department = department;
    }

    public void displaysubject() {
        System.out.println("Subject: " + subject);
    }

    public void displaydepartment() {
        System.out.println("Department: " + department);
    }
}
