import java.util.Scanner;
import java.util.ArrayList;

public class Student implements SystemFunctions{
    //Scanner built
    Scanner sc = new Scanner(System.in);
    //Student's Info
    private String firstName; 
    private String lastName;
    private String emailAddress;
    private String major;
    private String registerDate;
    private String studentID;

    //Constructor
    public Student(String firstName, String lastName, String emailAddress, String major, String registerDate,
            String studentID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.major = major;
        this.registerDate = registerDate;
        this.studentID = studentID;
    }

    public void addStudent(){
        System.out.println("First name: ");
        this.firstName = sc.next();
        System.out.println("Last name: ");
        this.lastName = sc.next();
        System.out.println("E-mail Address: ");
        this.emailAddress = sc.next();
        System.out.println("Major: ");
        this.major = sc.next();
        System.out.println("Registerd date(yyyy/mm/dd): ");
        this.registerDate = sc.next();
        System.out.println("Student ID: ");
        this.studentID = sc.next();
    }

    public Student getStudent(String id, ArrayList<Student>studenList){
        for (Student student : studenList) {
            if (student.getStudentID().equals(id)) {
                return student;
            }
        }
        return null;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "Student Info:\nfirstName = " + firstName + "\nlastName = " + lastName + "\nemailAddress = " + emailAddress
                + "\nmajor = " + major + "\nregisterDate = " + registerDate + "\nstudentID = " + studentID + "\n";
    }
}
