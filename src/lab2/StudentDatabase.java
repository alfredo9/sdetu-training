package lab2;

public class StudentDatabase {

    public static void main(String[] args) {
        Student stu1 = new Student("Joe", "465329574");
        Student stu2 = new Student("Victor", "654132987");
        Student stu3 = new Student("Brian", "311569756");

        stu1.setPhone("8563751234");
        stu1.setCity("Atlanta");
        stu1.setState("Georgia");

        System.out.println("Phone: " + stu1.getPhone());
        System.out.println("City: " + stu1.getCity());
        System.out.println("State: " + stu1.getState());

        stu1.enroll("History");
        stu1.pay(500);
        stu1.checkBalance();
        stu1.enroll("Java");

    }
}

class Student {

    private static int iD = 1000;
    private String email;
    private String userId;
    private String name;
    private String SSN;
    private String phone;
    private String city;
    private String state;
    private double balance = 1000;
    private String courses = "";

    // Constructor
    public Student(String name, String SSN) {
        this.name = name;
        System.out.println("Name: " + name);
        this.SSN = SSN;
        iD++;
        setUserId();
        setEmail();

    }

    private void setUserId() {
        int random = (int) (Math.random() * 8000 + 1000);
        userId = iD + "" + random + SSN.substring(5);
        System.out.println("Your User ID: " + userId);

    }

    private void setEmail() {
        email = name + "@udemy.com";
        System.out.println("Your Email: " + email);

    }

    public void enroll(String course) {
        courses = courses + course + ". ";
        System.out.println("Course enrolled: " + course);
        showCourses();
    }

    public void pay(double amount) {
        balance = balance - amount;
        System.out.println("Paid: " + amount);

    }

    public void checkBalance() {
        System.out.println("Balance: " + balance);

    }

    public void showCourses() {
        System.out.println("Courses: " + courses);
    }

    // getters and setters
    public void setPhone(String phone) {
        this.phone = phone;

    }

    public String getPhone() {
        return phone;
    }

    public void setCity(String city) {
        this.city = city;

    }

    public String getCity() {
        return city;
    }

    public void setState(String state) {
        this.state = state;

    }

    public String getState() {
        return state;
    }

}
