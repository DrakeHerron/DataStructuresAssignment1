public class student {
    //(name, creditsNbr, gpa
    private String name;
    private int creditsNbr;
    private double gpa;
    private int id;
    
    public student() {
        this.name = "John Doe";
        this.creditsNbr = 0;
        this.gpa = 0.00;
        this.id = 0;
    }
    
    public student(String name, int creditsNbr, double gpa, int id) {
        this.name = name;
        this.creditsNbr = creditsNbr;
        this.gpa = gpa;
        this.id = id;
    }
    
    public String getName() {return name;}
    public int getCreditsNbr() {return creditsNbr;}
    public double getGpa() {return gpa;}
    public int getId() {return id;}
    
    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", creditsNbr=" + creditsNbr +
                ", gpa=" + gpa +
                ", id=" + id +
                "}\n";
    }
}
