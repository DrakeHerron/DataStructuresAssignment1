import java.util.Scanner;

public class main {
    public static void main(String[] args)  {
        System.out.println("Course:");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        
        System.out.println("Location:");
        String location = s.nextLine();
        
        System.out.println("Number of Students:");
        boolean x = true;
        int studentsNum = 1;
        while(x) {
            if (s.hasNextInt()) {
                studentsNum = s.nextInt();
                x = false;
            }
            else{
                System.out.println("Please enter a number:");
                s.nextLine();
            }
        }
        
        course courseArray = new course(name, location, studentsNum);
        String studentName;
        int credits = 0;
        double gpa = 0;
        int id = 0;
        s.nextLine();
        for(int i = 0; i < studentsNum; i++){
            System.out.println("Student Name:");
            studentName = s.nextLine();
            
            System.out.println("Students Credits:");
            x = true;
            while(x) {
                if (s.hasNextInt()) {
                    credits = s.nextInt();
                    x = false;
                }
                else{
                    System.out.println("Please enter a number:");
                    s.nextLine();
                }
            }
            s.nextLine();
            System.out.println("Students GPA:");
            x = true;
            while(x) {
                if (s.hasNextDouble()) {
                    gpa = s.nextDouble();
                    x = false;
                }
                else{
                    System.out.println("Please enter a number:");
                    s.nextLine();
                }
            }
            s.nextLine();
            System.out.println("Students ID:");
            x = true;
            while(x) {
                if (s.hasNextInt()) {
                    id = s.nextInt();
                    x = false;
                }
                else{
                    System.out.println("Please enter a number:");
                    s.nextLine();
                }
            }
            s.nextLine();
            courseArray.addStudent(new student(studentName, credits, gpa, id));
        }
        
        boolean quit = true;
        int response;
        while(quit) {
            System.out.println("1 Display Students \n2 Search for a student - by ID \n3 Sort (by GPA) \n4 Quit");
            if(s.hasNextInt()) {
                response = s.nextInt();
                if (response == 1){
                    System.out.println(courseArray.display());
                }
                else if(response == 2){
                    System.out.println("Students ID:");
                    x = true;
                    while(x) {
                        if (s.hasNextInt()) {
                            id = s.nextInt();
                            x = false;
                        }
                        else{
                            System.out.println("Please enter a number:");
                            s.nextLine();
                        }
                    }
                    System.out.println(courseArray.getID(id));
                }
                else if(response == 3){
                    System.out.println(courseArray.sort());
                }
                else if(response == 4){
                    quit = false;
                }
            }
            s.nextLine();
        }
    }
}
