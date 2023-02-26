import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Scanner set
        Scanner sc = new Scanner(System.in);

        //List created
        ArrayList<Student> studenList = new ArrayList<Student>();

        System.out.println("Welcome to use Student Info Search Tool.");
        Student student = new Student(null, null, null, null, null, null);
        //Let user choose which function to run.
        System.out.println("Type 1 to add a student, 2 to search a student, 3 to quit: ");
        int toolType = sc.nextInt();

        while(toolType != 3){
            if(toolType == 1){
                Student newStudent = new Student(null, null, null, null, null, null);
                newStudent.addStudent();
                studenList.add(newStudent);
                System.out.println("Type 1 to add another student, 2 to search a student, 3 to quit: ");
                toolType = sc.nextInt();
            }else if(toolType == 2){
                System.out.println("Search student by ID: ");
                String searchID = sc.next();
                System.out.println(student.getStudent(searchID, studenList));
                System.out.println("Type 1 to add student, 2 to search another student, 3 to quit: ");
                toolType = sc.nextInt();
            }
        }
        System.out.println("Thank you for using Student Info Search Tool, bye!");
        System.out.println(studenList);
        sc.close();
    }
}
