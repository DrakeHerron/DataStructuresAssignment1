import java.util.ArrayList;
import java.util.Scanner;

public class course {
    private String course;
    private String location;
    private student[] students;
    
    public course(){
        this.course = "No Course";
        this.location = "No Location";
    }
    public course(String course, String location, int studentsNum){
        this.course = course;
        this.location = location;
        this.students = new student[studentsNum];
    }
    
    public String getCourse() {return course;}
    public String getLocation() {return location;}
    
    public boolean addStudent(student student){
        for(int i=0; i < this.students.length; i++) {
            if (this.students[i] == null) {
                this.students[i] = student;
                return true;
            }
        }
        return false;
    }
    
    public String display(){
        String display = "";
        for(int i=0; i < this.students.length; i++){
            display += students[i].toString();
        }
        return display;
    }
    
    public String getID(int id){
        for(int i=0; i < this.students.length; i++){
            if(students[i].getId() == id){
                return students[i].toString();
            }
        }
        return "404 Not Found";
    }
    
    public String sort(){
        student swap;
        for(int i=0; i < this.students.length-1;i++){
            for(int j=i+1; j < this.students.length;j++){
                //System.out.println(students[i].getName()+" "+students[i].getGpa());
                //System.out.println(students[j].getName()+" "+students[j].getGpa());
                if(students[i].getGpa() > students[j].getGpa()){
                    //System.out.println("SWAP");
                    swap = students[i];
                    students[i] = students[j];
                    students[j] = swap;
                }
            }
        }
        return display();
    }
}
