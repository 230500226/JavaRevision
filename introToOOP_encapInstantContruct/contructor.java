// sub class
public class GradeBook{
    
    // contructor init vars with args
    public GradeBook( String name ){
        courseName = name;
    }
    
    // controlled encapsulated var
    private String courseName;

//  Setter 
    public void setCourseName( String name ){
        courseName = name;
    }
// Getter
    public String getCourseName(){
        return courseName;
    }

    public void displayMessage(){
        System.out.printf( "Welcome to the grade book for %s", getCourseName() );
    }
}